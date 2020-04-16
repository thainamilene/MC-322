class Main {
	
		static void criartabuleiro(Tabuleiros tabuleiro){
			pecas a1 = new pecas (' ', 0, 0);
			pecas a2 = new pecas (' ', 0, 1);
			pecas a3 = new pecas ('P', 0, 2);
			pecas a4 = new pecas ('P', 0, 3);
			pecas a5 = new pecas ('P', 0, 4);
			pecas a6 = new pecas (' ', 0, 5);
			pecas a7 = new pecas (' ', 0, 6);

			pecas b1 = new pecas (' ', 1, 0);
			pecas b2 = new pecas (' ', 1, 1);
			pecas b3 = new pecas ('P', 1, 2);
			pecas b4 = new pecas ('P', 1, 3);
			pecas b5 = new pecas ('P', 1, 4);
			pecas b6 = new pecas (' ', 1, 5);
			pecas b7 = new pecas (' ', 1, 6);

			pecas c1 = new pecas ('P', 2, 0);
			pecas c2 = new pecas ('P', 2, 1);
			pecas c3 = new pecas ('P', 2, 2);
			pecas c4 = new pecas ('P', 2, 3);
			pecas c5 = new pecas ('P', 2, 4);
			pecas c6 = new pecas ('P', 2, 5);
			pecas c7 = new pecas ('P', 2, 6);

			pecas d1 = new pecas ('P', 3, 0);
			pecas d2 = new pecas ('P', 3, 1);
			pecas d3 = new pecas ('P', 3, 2);
			pecas d4 = new pecas ('-', 3, 3);
			pecas d5 = new pecas ('P', 3, 4);
			pecas d6 = new pecas ('P', 3, 5);
			pecas d7 = new pecas ('P', 3, 6);

			pecas e1 = new pecas ('P', 4, 0);
			pecas e2 = new pecas ('P', 4, 1);
			pecas e3 = new pecas ('P', 4, 2);
			pecas e4 = new pecas ('P', 4, 3);
			pecas e5 = new pecas ('P', 4, 4);
			pecas e6 = new pecas ('P', 4, 5);
			pecas e7 = new pecas ('P', 4, 6);

			pecas f1 = new pecas (' ', 5, 0);
			pecas f2 = new pecas (' ', 5, 1);
			pecas f3 = new pecas ('P', 5, 2);
			pecas f4 = new pecas ('P', 5, 3);
			pecas f5 = new pecas ('P', 5, 4);
			pecas f6 = new pecas (' ', 5, 5);
			pecas f7 = new pecas (' ', 5, 6);

			pecas g1 = new pecas (' ', 6, 0);
			pecas g2 = new pecas (' ', 6, 1);
			pecas g3 = new pecas ('P', 6, 2);
			pecas g4 = new pecas ('P', 6, 3);
			pecas g5 = new pecas ('P', 6, 4);
			pecas g6 = new pecas (' ', 6, 5);
			pecas g7 = new pecas (' ', 6, 6);

			tabuleiro.montar(a1);
			tabuleiro.montar(a2);
			tabuleiro.montar(a3);
			tabuleiro.montar(a4);
			tabuleiro.montar(a5);
			tabuleiro.montar(a6);
			tabuleiro.montar(a7);

			tabuleiro.montar(b1);
			tabuleiro.montar(b2);
			tabuleiro.montar(b3);
			tabuleiro.montar(b4);
			tabuleiro.montar(b5);
			tabuleiro.montar(b6);
			tabuleiro.montar(b7);

			tabuleiro.montar(c1);
			tabuleiro.montar(c2);
			tabuleiro.montar(c3);
			tabuleiro.montar(c4);
			tabuleiro.montar(c5);
			tabuleiro.montar(c6);
			tabuleiro.montar(c7);

			tabuleiro.montar(d1);
			tabuleiro.montar(d2);
			tabuleiro.montar(d3);
			tabuleiro.montar(d4);
			tabuleiro.montar(d5);
			tabuleiro.montar(d6);
			tabuleiro.montar(d7);

			tabuleiro.montar(e1);
			tabuleiro.montar(e2);
			tabuleiro.montar(e3);
			tabuleiro.montar(e4);
			tabuleiro.montar(e5);
			tabuleiro.montar(e6);
			tabuleiro.montar(e7);

			tabuleiro.montar(f1);
			tabuleiro.montar(f2);
			tabuleiro.montar(f3);
			tabuleiro.montar(f4);
			tabuleiro.montar(f5);
			tabuleiro.montar(f6);
			tabuleiro.montar(f7);

			tabuleiro.montar(g1);
			tabuleiro.montar(g2);
			tabuleiro.montar(g3);
			tabuleiro.montar(g4);
			tabuleiro.montar(g5);
			tabuleiro.montar(g6);
			tabuleiro.montar(g7);
					
		}
		static boolean matarpeca(Tabuleiros tabuleiro, int coluna, int linha){ 	
			if (tabuleiro.tabuleiro[linha][coluna].estado == 'P'){
				tabuleiro.tabuleiro[linha][coluna].estado = '-';
			} else{
				System.out.println("Jogada invalida");
				return false;
			}
			return true;
		}

		static void jogada (Tabuleiros tabuleiro, String commands[]){
				int iini = -1, 
					ifim = -1;
				boolean v;
			for (int i=0; i<commands.length; i++){
				System.out.println("Source: " + commands[i].substring(0,2));
				System.out.println("Target: " + commands[i].substring(3,5));
				String ini =  commands[i].substring(0,1);
				String fim =  commands[i].substring(3,4);
				if (ini.equals("a")){
					iini = 0;
				} else if (ini.equals("b")) {
					iini = 1;
				} else if (ini.equals("c")) {
					iini = 2;
				} else if (ini.equals("d")) {
					iini = 3;
				} else if (ini.equals("e")) {
					iini = 4;
				} else if (ini.equals("f")) {
					iini = 5;
				} else if (ini.equals("g")) {
					iini = 6;
				}

				if (fim.equals("a")){
					ifim = 0;
				} else if (fim.equals("b")) {
					ifim = 1;
				} else if (fim.equals("c")) {
					ifim = 2;
				} else if (fim.equals("d")) {
					ifim = 3;
				} else if (fim.equals("e")) {
					ifim = 4;
				} else if (fim.equals("f")) {
					ifim = 5;
				} else if (fim.equals("g")) {
					ifim = 6;
				}

				int jini = Integer.parseInt(commands[i].substring(1,2));
				int jfim = Integer.parseInt(commands[i].substring(4,5));
				jini--;
				jfim--; 
				if (iini == ifim){
					v = matarpeca(tabuleiro, iini, (jini + jfim)/2);
				} else{
					v = matarpeca(tabuleiro, (iini + ifim)/2, jini);
				}
				if (v==true){
					tabuleiro.tabuleiro[jini][iini].estado = '-';
					tabuleiro.tabuleiro[jfim][ifim].estado = 'P';
					tabuleiro.imprimir();
				}
			}

		}

	public static void main (String[] args){
			Tabuleiros tabuleiro = new Tabuleiros();
			criartabuleiro(tabuleiro);
			System.out.println("Tabuleiro inicial:");
			tabuleiro.imprimir();
			CSVReader csv = new CSVReader();
			csv.setDataSource("./arq001.csv");
			String commands[] = csv.requestCommands();
			jogada(tabuleiro, commands);
	}

}