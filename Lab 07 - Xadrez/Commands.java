public class Commands extends CSVReader {
    Commands[] array;
    int[] source = new int [2]; //guarda a linha e coluna do source
    int[] target = new int [2]; //guarda a linha e coluna do target
    String source2, target2; //guarda as strings com o source e target
    char newtype; //guarda o novo tipo se o movimento for do tipo transforma

    Commands() {
        super();
    }
    public Commands[] requestCommands(int i) {
        String[] commands;
        commands=requestCommands();
        createArray(commands);
        return array;
    }

    void createArray(String[] commands) { //transforma o vetor de strings gerado por CSVReader em um vetor com os comandos
        array = new Commands[commands.length];
        int j = 0;
        for (int i = 0; i < commands.length; i++) {
            if(i<commands.length-1 && commands[i].length()>1 && commands[i+1].length()==1) {
                array[j] = new Transforms(commands[i], commands[i+1]);
                j--;
            }
            else if(commands[i].length()>1) {
                array[j] = new Moviment(commands[i]);
            }
            j++;
        }
        return;
    }

}