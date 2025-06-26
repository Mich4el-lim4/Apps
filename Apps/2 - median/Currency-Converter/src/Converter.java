public class Converter {
    double convertido;

    public void converter(int option, double value){

        switch (option) {
            case 1 -> {
                convertido =  value / 5;
            }
            case 2 -> {
                convertido = value * 5;
            }
            case 3 -> {
                convertido = value / 6;
            }
            case 4 -> {
                convertido = value * 6;
            }
        }
    }

    public String getConvertido(){
        return String.format("%.2f", convertido);
    }
}
