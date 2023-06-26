class ResistorColor {

    String[] colorsArray = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        int code;
        for(code = 0; code <= 9; code++){
            if(color.equals(colorsArray[code])){
                break;
            }
        }
        return code;
    }

    String[] colors() {
        return colorsArray;
    }
}
