class Main{
	static void criarpecas(Tabuleiro tabuleiro){
		Pecagenerica P1 = new Pecagenerica('P', true, 7, 1, true, false);
		Pecagenerica P2 = new Pecagenerica('P', true, 7, 3, true, false);
		Pecagenerica P3 = new Pecagenerica('P', true, 7, 5, true, false);
		Pecagenerica P4 = new Pecagenerica('P', true, 7, 7, true, false);
		Pecagenerica P5 = new Pecagenerica('P', true, 6, 0, true, false);
		Pecagenerica P6 = new Pecagenerica('P', true, 6, 2, true, false);
		Pecagenerica P7 = new Pecagenerica('P', true, 6, 4, true, false);
		Pecagenerica P8 = new Pecagenerica('P', true, 6, 6, true, false);
		Pecagenerica P9 = new Pecagenerica('P', true, 5, 1, true, false);
		Pecagenerica P10 = new Pecagenerica('P', true, 5, 3, true, false);
		Pecagenerica P11 = new Pecagenerica('P', true, 5, 5, true, false);
		Pecagenerica P12 = new Pecagenerica('P', true, 5, 7, true, false);
		
		Pecagenerica B1 = new Pecagenerica('B', true, 0, 0, true, false);
		Pecagenerica B2 = new Pecagenerica('B', true, 0, 2, true, false);
		Pecagenerica B3 = new Pecagenerica('B', true, 0, 4, true, false);
		Pecagenerica B4 = new Pecagenerica('B', true, 0, 6, true, false);
		Pecagenerica B5 = new Pecagenerica('B', true, 1, 1, true, false);
		Pecagenerica B6 = new Pecagenerica('B', true, 1, 3, true, false);
		Pecagenerica B7 = new Pecagenerica('B', true, 1, 4, true, false);
		Pecagenerica B8 = new Pecagenerica('B', true, 1, 5, true, false);
		Pecagenerica B9 = new Pecagenerica('B', true, 2, 0, true, false);
		Pecagenerica B10 = new Pecagenerica('B', true, 2, 2, true, false);
		Pecagenerica B11 = new Pecagenerica('B', true, 2, 4, true, false);
		Pecagenerica B12 = new Pecagenerica('B', true, 2, 6, true, false);

		tabuleiro.Montar(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12);
	}

	static void jogada(String commands[], Tabuleiro tabuleiro){
			int jini = -1, 
				jfim = -1;
			int lance = -1; //0 se for o lance das brancas, e 1 se for o lance preto
		for (int i=0; i<commands.length; i++){
			System.out.println("Source: " + commands[i].substring(0,2));
			System.out.println("Target: " + commands[i].substring(3,5));
			String ini =  commands[i].substring(0,1);
			String fim =  commands[i].substring(3,4);
			if (ini.equals("a")){
				jini = 0;
			} else if (ini.equals("b")) {
				jini = 1;
			} else if (ini.equals("c")) {
				jini = 2;
			} else if (ini.equals("d")) {
				jini = 3;
			} else if (ini.equals("e")) {
				jini = 4;
			} else if (ini.equals("f")) {
				jini = 5;
			} else if (ini.equals("g")) {
				jini = 6;
			} else if (ini.equals("h")){
				jini = 7;
			}

			if (fim.equals("a")){
				jfim = 0;
			} else if (fim.equals("b")) {
				jfim = 1;
			} else if (fim.equals("c")) {
				jfim = 2;
			} else if (fim.equals("d")) {
				jfim = 3;
			} else if (fim.equals("e")) {
				jfim = 4;
			} else if (fim.equals("f")) {
				jfim = 5;
			} else if (fim.equals("g")) {
				jfim = 6;
			} else if (fim.equals("h")){
				jfim = 7;
			}
			int iini = Integer.parseInt(commands[i].substring(1,2));
			int ifim = Integer.parseInt(commands[i].substring(4,5));
			iini--;
			ifim--;
			if(i==0){
				if (tabuleiro.tabuleiro[iini][jini].cor == 'B'){
					lance = 0;
				} 
				else if (tabuleiro.tabuleiro[iini][jini].cor == 'P'){
					lance = 1;
				}
			}
			boolean verificacao = false;
			if ((lance == 0 && tabuleiro.tabuleiro[iini][jini].cor == 'B') || (lance == 1 && tabuleiro.tabuleiro[iini][jini].cor == 'P')){
				if(tabuleiro.tabuleiro[iini][jini].estado == true && tabuleiro.tabuleiro[ifim][jfim].estado == false){
					if (tabuleiro.tabuleiro[iini][jini].pNormal == true ){
						verificacao = tabuleiro.tabuleiro[iini][jini].saidaN.verificacaoLance(ifim,jfim,tabuleiro);
						if (verificacao == true){
							System.out.println("verificacao");
							tabuleiro.movimentopecaNormal(iini, jini, ifim, jfim);
						}
					}
					else{
						verificacao = tabuleiro.tabuleiro[iini][jini].saidaD.verificacaoLance(ifim,jfim,tabuleiro);
					}
				}
			}
			if (lance == 0) {
				lance++;
			}
			else{
				lance--;
			}
		}
	}

	public static void main(String[] args){
		Tabuleiro tabuleiro = new Tabuleiro();
		criarpecas(tabuleiro);
		CSVReader csv = new CSVReader();
		csv.setDataSource("./arq001.csv");
		String commands[] = csv.requestCommands();
		jogada(commands, tabuleiro);
	}
}