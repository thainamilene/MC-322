public class Commands extends CSVReader{
    Commands[] array;
    int[] source = new int [2];
    int[] target = new int [2];
    String source2, target2;
    char newtype;

    Commands(){
        super();
    }
    public Commands[] requestCommands(int i) {
        String[] commands;
        commands=requestCommands();
        createArray(commands);
        return array;
    }

    void createArray(String[] commands){
        for (int i = 0; i < commands.length; i++) {
            if(commands[i].length()>1){
                array[i] = new Moviment(commands[i]);
            }
            else{
                array[i] = new Transforms(commands[i]);
            }
        }
        return;
    }

}