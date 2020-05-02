public class Moviment extends Commands {
  
    Moviment(String move) {
        super();
        source2 = move.substring(0,2);
		target2 = move.substring(3,5);
        String ini = move.substring(0,1);
        String fim = move.substring(3,4);
        if (ini.equals("a")) {
            source[1] = 0;
        } else if (ini.equals("b")) {
            source[1] = 1;
        } else if (ini.equals("c")) {
            source[1] = 2;
        } else if (ini.equals("d")) {
            source[1] = 3;
        } else if (ini.equals("e")) {
            source[1] = 4;
        } else if (ini.equals("f")) {
            source[1] = 5;
        } else if (ini.equals("g")) {
            source[1] = 6;
        } else if (ini.equals("h")) {
            source[1] = 7;
        }

        if (fim.equals("a")) {
            target[1] = 0;
        } else if (fim.equals("b")) {
            target[1] = 1;
        } else if (fim.equals("c")) {
            target[1] = 2;
        } else if (fim.equals("d")) {
            target[1] = 3;
        } else if (fim.equals("e")) {
            target[1] = 4;
        } else if (fim.equals("f")) {
            target[1] = 5;
        } else if (fim.equals("g")) {
            target[1] = 6;
        } else if (fim.equals("h")) {
            target[1] = 7;
        }

        source[0] = Integer.parseInt(move.substring(1,2));
        target[0] = Integer.parseInt(move.substring(4,5));
        source[0]--;
        target[0]--;
    }
}