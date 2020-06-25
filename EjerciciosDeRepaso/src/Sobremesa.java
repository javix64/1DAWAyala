public class Sobremesa {
    private String tipoMonitor;
    private String sizeMonitor;    
    private String velocidadCpu;
    private String hdCpu;
    private String numeroTeclasTeclado;
    private String tipoDeTeclado;
    int precioTipoMonitor;
    int precioSizeMonitor;
    int precioVelocidadCpu;
    int precioHdCpu;
    int precioNumeroTeclasTeclado;
    int precioTipoDeTeclado;    

    public Sobremesa(String tipoMonitor, String sizeMonitor, String velocidadCpu, String hdCpu, String numeroTeclasTeclado, String tipoDeTeclado, int precioTipoMonitor, int precioSizeMonitor, int precioVelocidadCpu, int precioHdCpu, int precioNumeroTeclasTeclado, int precioTipoDeTeclado) {
        this.tipoMonitor = tipoMonitor;
        this.sizeMonitor = sizeMonitor;
        this.velocidadCpu = velocidadCpu;
        this.hdCpu = hdCpu;
        this.numeroTeclasTeclado = numeroTeclasTeclado;
        this.tipoDeTeclado = tipoDeTeclado;
        this.precioTipoMonitor = precioTipoMonitor;
        this.precioSizeMonitor = precioSizeMonitor;
        this.precioVelocidadCpu = precioVelocidadCpu;
        this.precioHdCpu = precioHdCpu;
        this.precioNumeroTeclasTeclado = precioNumeroTeclasTeclado;
        this.precioTipoDeTeclado = precioTipoDeTeclado;
    }
    public Sobremesa() {
        this.tipoMonitor = "LCD";
        this.sizeMonitor = "17 pulgadas";
        this.velocidadCpu = "3000MHz";
        this.hdCpu = "4TB";
        this.numeroTeclasTeclado = "102 Teclas";
        this.tipoDeTeclado = "Inalambrico";
        this.precioTipoMonitor = 300;
        this.precioSizeMonitor = 200;
        this.precioVelocidadCpu = 200;
        this.precioHdCpu = 200;
        this.precioNumeroTeclasTeclado = 200;
        this.precioTipoDeTeclado = 200;
    }

    public String getTipoMonitor() {
        return tipoMonitor;
    }

    public void setTipoMonitor(String tipoMonitor) {
        this.tipoMonitor = tipoMonitor;
    }

    public String getSizeMonitor() {
        return sizeMonitor;
    }

    public void setSizeMonitor(String sizeMonitor) {
        this.sizeMonitor = sizeMonitor;
    }

    public String getVelocidadCpu() {
        return velocidadCpu;
    }

    public void setVelocidadCpu(String velocidadCpu) {
        this.velocidadCpu = velocidadCpu;
    }

    public String getHdCpu() {
        return hdCpu;
    }

    public void setHdCpu(String hdCpu) {
        this.hdCpu = hdCpu;
    }

    public String getNumeroTeclasTeclado() {
        return numeroTeclasTeclado;
    }

    public void setNumeroTeclasTeclado(String numeroTeclasTeclado) {
        this.numeroTeclasTeclado = numeroTeclasTeclado;
    }

    public String getTipoDeTeclado() {
        return tipoDeTeclado;
    }

    public void setTipoDeTeclado(String tipoDeTeclado) {
        this.tipoDeTeclado = tipoDeTeclado;
    }

    public int getPrecioTipoMonitor() {
        return precioTipoMonitor;
    }

    public void setPrecioTipoMonitor(int precioTipoMonitor) {
        this.precioTipoMonitor = precioTipoMonitor;
    }

    public int getPrecioSizeMonitor() {
        return precioSizeMonitor;
    }

    public void setPrecioSizeMonitor(int precioSizeMonitor) {
        this.precioSizeMonitor = precioSizeMonitor;
    }

    public int getPrecioVelocidadCpu() {
        return precioVelocidadCpu;
    }

    public void setPrecioVelocidadCpu(int precioVelocidadCpu) {
        this.precioVelocidadCpu = precioVelocidadCpu;
    }

    public int getPrecioHdCpu() {
        return precioHdCpu;
    }

    public void setPrecioHdCpu(int precioHdCpu) {
        this.precioHdCpu = precioHdCpu;
    }

    public int getPrecioNumeroTeclasTeclado() {
        return precioNumeroTeclasTeclado;
    }

    public void setPrecioNumeroTeclasTeclado(int precioNumeroTeclasTeclado) {
        this.precioNumeroTeclasTeclado = precioNumeroTeclasTeclado;
    }

    public int getPrecioTipoDeTeclado() {
        return precioTipoDeTeclado;
    }

    public void setPrecioTipoDeTeclado(int precioTipoDeTeclado) {
        this.precioTipoDeTeclado = precioTipoDeTeclado;
    }

    public String precioTotal(){
        return "\nEl precio por piezas del ordenador es: \n"
                + "Precio del HD CPU: "+precioHdCpu+"\n"+
                "Precio tamaño del monitor: "+precioSizeMonitor+"\n"+
                "Precio teclado: "+precioTipoDeTeclado+"\n"+
                "Precio número de teclas: "+precioNumeroTeclasTeclado+"\n"+
                "Precio Tipo de monitor: "+precioTipoMonitor+"\n"+
                "Precio Velocidad CPU: "+precioVelocidadCpu+"\n"+
                "El precio total es: "+(precioHdCpu+precioSizeMonitor+precioTipoDeTeclado+precioNumeroTeclasTeclado+precioTipoMonitor+precioVelocidadCpu)+"$";
    }
    public String caracteristicas(){
        return "\nEl tamaño del monitor es de: "+sizeMonitor
                +"\nEl tipo de monitor es de: "+tipoMonitor
                +"\nLa velocidad de Cpu es de: "+velocidadCpu
                +"\nLa capacidad de HD es de: "+hdCpu
                +"\n El numero de teclas es de: "+numeroTeclasTeclado
                +"\nEl tipo de teclado es de: "+tipoDeTeclado;
    }
}
