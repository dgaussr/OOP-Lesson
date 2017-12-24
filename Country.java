import java.util.ArrayList;

public class Country {
    private String name;
    private String capital;
    private double dimension;
    private ArrayList<String> borderCountries = new ArrayList<>();
    private ArrayList<String> equalBorders = new ArrayList<>();

    public void setBorda(ArrayList<String> borda) {
        this.borderCountries = borda;
    }

    public Country(String name, String capital, float dimension) {
        this.name = name;
        this.capital = capital;
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }


    //metodo para adicionar pais fronteira
    public void add_border(String nomePais){
        borderCountries.add(nomePais);
    }

    //metodo para listar os paises fronteiras
    public void listarPaises(){
        System.out.println(borderCountries.toString());
    }

    //metodo para comparar se os paises sao iguais
    public boolean equals(final Country other){ //perguntar argumentos
        if (this.name == other.name && this.capital == other.capital){
            return true;
        }else{
            return false;
        }
    }

    //metodo para ver se dois paises tem um pais na borda igual
    public void border_comparison(Country other){
        System.out.println("\npaises fronteiras iguais entre o pais " +this.name + " e o pais " + other.name);
        int counter = 0;
        for (int i = 0; i < this.borderCountries.size(); i++){
            for (int j = 0; j < other.borderCountries.size(); j++){
                if(this.borderCountries.get(i).equals(other.borderCountries.get(j))){ //apenas consegui usando .equals não sei se existe jeito melhor
                    equalBorders.add(this.borderCountries.get(i));
                    counter++;
                }
            }
        }
        if (counter == 0){
            System.out.println("nao existe paises fronteiras iguais");
        }else{
            System.out.println(equalBorders.toString());
        }
    }







}
