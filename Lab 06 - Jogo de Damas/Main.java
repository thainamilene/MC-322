class Main{

	static void criarPecas(Tabuleiro tabuleiro){//criando e colocando as pecas no tabuleiro

		tabuleiro.tabuleiro[7][1] = new Pecagenerica('P', true, 7, 1, true, false);
		tabuleiro.tabuleiro[7][3] = new Pecagenerica('P', true, 7, 3, true, false);
		tabuleiro.tabuleiro[7][5] = new Pecagenerica('P', true, 7, 5, true, false);
		tabuleiro.tabuleiro[7][7] = new Pecagenerica('P', true, 7, 7, true, false);
		tabuleiro.tabuleiro[6][0] = new Pecagenerica('P', true, 6, 0, true, false);
		tabuleiro.tabuleiro[6][2] = new Pecagenerica('P', true, 6, 2, true, false);
		tabuleiro.tabuleiro[6][4] = new Pecagenerica('P', true, 6, 4, true, false);
		tabuleiro.tabuleiro[6][6] = new Pecagenerica('P', true, 6, 6, true, false);
		tabuleiro.tabuleiro[5][1] = new Pecagenerica('P', true, 5, 1, true, false);
		tabuleiro.tabuleiro[5][3] = new Pecagenerica('P', true, 5, 3, true, false);
		tabuleiro.tabuleiro[5][5] = new Pecagenerica('P', true, 5, 5, true, false);
		tabuleiro.tabuleiro[5][7] = new Pecagenerica('P', true, 5, 7, true, false);

		tabuleiro.tabuleiro[0][0] = new Pecagenerica('B', true, 0, 0, true, false);
		tabuleiro.tabuleiro[0][2] = new Pecagenerica('B', true, 0, 2, true, false);
		tabuleiro.tabuleiro[0][4] = new Pecagenerica('B', true, 0, 4, true, false);
		tabuleiro.tabuleiro[0][6] = new Pecagenerica('B', true, 0, 6, true, false);
		tabuleiro.tabuleiro[1][1] = new Pecagenerica('B', true, 1, 1, true, false);
		tabuleiro.tabuleiro[1][3] = new Pecagenerica('B', true, 1, 3, true, false);
		tabuleiro.tabuleiro[1][5] = new Pecagenerica('B', true, 1, 5, true, false);
		tabuleiro.tabuleiro[1][7] = new Pecagenerica('B', true, 1, 7, true, false);
		tabuleiro.tabuleiro[2][0] = new Pecagenerica('B', true, 2, 0, true, false);
		tabuleiro.tabuleiro[2][2] = new Pecagenerica('B', true, 2, 2, true, false);
		tabuleiro.tabuleiro[2][4] = new Pecagenerica('B', true, 2, 4, true, false);
		tabuleiro.tabuleiro[2][6] = new Pecagenerica('B', true, 2, 6, true, false);

		tabuleiro.montar();
	}

	static void jogada(String commands[], Tabuleiro tabuleiro){
			int jini = -1, 
				jfim = -1;
			int lance = -1; //0 se for o lance das brancas, e 1 se for o lance preto
			int cont = 0; //contador para o numero de rodadas consecutivas da mesma peca
			String vfim = "Aa";
		for (int i=0; i<commands.length; i++){
			System.out.println("Source: " + commands[i].substring(0,2));
			System.out.println("Target: " + commands[i].substring(3,5));
			String cini = commands[i].substring(0,2);
			String ini = commands[i].substring(0,1);
			String cfim = commands[i].substring(3,5);
			String fim = commands[i].substring(3,4);
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

			if (i==0){
				if(tabuleiro.tabuleiro[iini][jini].cor == 'P'){
					lance = 1;
				} 
				else if(tabuleiro.tabuleiro[iini][jini].cor == 'B'){
					lance = 0;
				}
			}
			else if((i!=0) && !(vfim.equals(cini)) &&( (tabuleiro.tabuleiro[iini][jini].cor=='P' && lance==0) || (tabuleiro.tabuleiro[iini][jini].cor == 'B' && lance == 1))){ //verifica se ainda e o lance da mesma peca da rodada anterior
				if(tabuleiro.tabuleiro[iini][jini].cor == 'P'){
					lance = 1;
					cont = 0;
				} 
				else if(tabuleiro.tabuleiro[iini][jini].cor == 'B'){
					lance = 0;
					cont = 0;
				}
			}
			cont++;
			boolean verificacao = false;
			if ((lance == 0 && tabuleiro.tabuleiro[iini][jini].cor == 'B') || (lance == 1 && tabuleiro.tabuleiro[iini][jini].cor == 'P')){ //verifica se a jogada pertence ao lance certo
				if(tabuleiro.tabuleiro[iini][jini].estado == true && tabuleiro.tabuleiro[ifim][jfim].estado == false){ //verifica se a posicao final esta vazia e se a inicial nao esta
					if (tabuleiro.tabuleiro[iini][jini].pNormal == true ){ //verifica se trata-se de uma peca normal
						verificacao = tabuleiro.tabuleiro[iini][jini].saidaN.verificacaoLance(ifim,jfim,tabuleiro, cont);
					}
					else{ //caso a peca seja do tipo Dama
						verificacao = tabuleiro.tabuleiro[iini][jini].saidaD.verificacaoLance(ifim,jfim,tabuleiro, cont);
					}
				}
			}
			if(verificacao == false){
				System.out.println("Jogada Inválida");
				System.out.println(" ");
			}
			vfim=cfim;
		}
	}

	public static void main(String[] args){
		Tabuleiro tabuleiro = new Tabuleiro();
		criarPecas(tabuleiro);
		CSVReader csv = new CSVReader();
		csv.setDataSource("./arq001.csv");
		String commands[] = csv.requestCommands();
		jogada(commands, tabuleiro);
	}
}