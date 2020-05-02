public class Commands extends CSVReader {
    Commands[] array;
    int[] source = new int [2];
    int[] target = new int [2];
    String source2, target2;
    char newtype;

    Commands() {
        super();
    }
    public Commands[] requestCommands(int i) {
        String[] commands;
        commands=requestCommands();
        createArray(commands);
        return array;
    }

    void createArray(String[] commands) {
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