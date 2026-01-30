import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("═══════════════════════════════════════════");
        System.out.println("         🛒 SUPERMERCADO - PRODUCTOS        ");
        System.out.println("═══════════════════════════════════════════\n");

        // ═══════════════════════════════════════════
        // VINOS
        // ═══════════════════════════════════════════
        System.out.println("VINOS");
        System.out.println("───────────────────────────────────────────");

        Vino v1 = new Vino("Marqués de Riscal", 12.50, "Botella de vidrio", 0.75, LocalDate.of(2028, 12, 31),
                "Rioja Reserva", 14);
        System.out.println(v1);
        System.out.println();

        Vino v2 = new Vino("Protos", 18.90, "Botella de vidrio", 0.75, LocalDate.of(2030, 6, 15), "Ribera del Duero",
                13);
        System.out.println(v2);
        System.out.println();

        // ═══════════════════════════════════════════
        // CEREALES
        // ═══════════════════════════════════════════
        System.out.println("CEREALES");
        System.out.println("───────────────────────────────────────────");

        Cereales c1 = new Cereales("Kellogg's", 3.50, LocalDate.of(2026, 6, 15), "maiz");
        System.out.println(c1 + "\n" + "Calorias: " + c1.getCalorias());
        System.out.println("Calorias: " + c1.getCalorias());
        System.out.println();

        Cereales c2 = new Cereales("Nestlé", 4.20, LocalDate.of(2026, 8, 20), "trigo");
        System.out.println(c2 + "\n" + "Calorias: " + c2.getCalorias());
        System.out.println();

        Cereales c3 = new Cereales("Hacendado", 2.80, LocalDate.of(2026, 5, 10), "espelta");
        System.out.println(c3 + "\n" + "Calorias: " + c3.getCalorias());
        System.out.println();

        // ═══════════════════════════════════════════
        // DETERGENTES
        // ═══════════════════════════════════════════
        System.out.println("DETERGENTES");
        System.out.println("───────────────────────────────────────────");

        Detergente d1 = new Detergente("Fairy", 3.99, "Botella de plástico", 1.0);
        d1.setDescuento(0.2);
        System.out.println(d1);
        System.out.println();

        Detergente d2 = new Detergente("Ariel", 8.50, "Garrafa de plástico", 3.0);
        d2.setDescuento(0.5);
        System.out.println(d2);
        System.out.println();

        System.out.println("═══════════════════════════════════════════");
        System.out.println("          FIN DEL LISTADO DE PRODUCTOS      ");
        System.out.println("═══════════════════════════════════════════");
    }
}
