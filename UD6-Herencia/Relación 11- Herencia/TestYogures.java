public class TestYogures {
    public static void main(String[] args) {
        Yogur yogurNormal = new Yogur();
        YogurDesnatado yogurDesnatado = new YogurDesnatado();

        System.out.println("Calorías del Yogur normal: " + yogurNormal.getCalorias());
        System.out.println("Calorías del Yogur desnatado: " + yogurDesnatado.getCalorias());
    }
}

