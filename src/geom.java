public class geom {
    int nlados;
    double lado, altura, base, radio, NPi;
    private int valorsecreto;

    public geom(int nlados, double lado, double altura, double base, double radio, double NPi) {
        this.nlados = nlados;
        this.lado = lado;
        this.altura = altura;
        this.base = base;
        this.radio = radio;
        this.NPi = NPi;
    }

    public geom(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setNPi(double NPi) {
        this.NPi = NPi;
    }

    public int getNlados() {
        return nlados;
    }

    public double getLado() {
        return lado;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getRadio() {
        return radio;
    }

    public double getNPi() {
        return NPi;
    }

    public double calculoArea(){
        return 3*6;
    }
}
