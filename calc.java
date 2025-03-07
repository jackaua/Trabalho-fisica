package calc;

import java.util.Scanner;

public class calc {
    public static double mm(double a, double b) {
        return a * b;
    }
    public static double dd(double a, double b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEscolha uma opcao:");
        System.out.println("1 - Velocidade media (espaco/tempo)");
        System.out.println("2 - Aceleracao media (velocidade/tempo)");
        System.out.println("3 - Forca respostaultante (massa * aceleracao)");
        System.out.println("4 - Tensao (respostaistencia * corrente)");
        System.out.println("5 - Potencia eletrica (tensao * corrente)");
        System.out.println("6 - Energia eletrica (potencia * tempo)");
        System.out.println("7 - Energia cinetica (0.5 * massa * velocidade^2)");
        System.out.println("8 - Energia potencial gravitacional (massa * altura * gravidade)");
        System.out.println("9 - Trabalho (forca * deslocamento * cos(angulo))");
        System.out.println("10 - Calor sensivel (massa * calorespostapecifico * variacao)");
        System.out.println("11 - Calor especifico (calor / (massa * variacao))");
        System.out.println("12 - Velocidade de onda (comprimento * frequencia)");
        System.out.println("13 - Prespostasao (forca / area)");
        System.out.println("14 - Densidade (massa / volume)");
        System.out.println("15 - Impulso (forca * tempo)");
        System.out.print("Opcao: ");
        String opcao = sc.nextLine();
        double x, y, z, resposta;

        if (opcao.equals("1")) {
            System.out.print("espaco (m): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("tempo (s): ");
            y = Double.parseDouble(sc.nextLine());
            resposta = dd(x, y);
            System.out.printf("velocidade media: %.2f m/s\n", resposta);

        } else if (opcao.equals("2")) {
            System.out.print("velocidade (m/s): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("tempo (s): ");
            y = Double.parseDouble(sc.nextLine());
            resposta = dd(x, y);
            System.out.printf("aceleracao media: %.2f m/s²\n", resposta);

        } else if (opcao.equals("3")) {
            System.out.print("massa (kg): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("aceleracao (m/s²): ");
            y = Double.parseDouble(sc.nextLine());
            resposta = mm(x, y);
            System.out.printf("forca respostaultante: %.2f n\n", resposta);

        } else if (opcao.equals("4")) {
            System.out.print("respostaistencia (ohm): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("corrente (a): ");
            y = Double.parseDouble(sc.nextLine());
            resposta = mm(x, y);
            System.out.printf("tensao: %.2f v\n", resposta);

        } else if (opcao.equals("5")) {
            System.out.print("tensao (v): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("corrente (a): ");
            y = Double.parseDouble(sc.nextLine());
            resposta = mm(x, y);
            System.out.printf("potencia eletrica: %.2f w\n", resposta);

        } else if (opcao.equals("6")) {
            System.out.print("potencia (w): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("tempo (s): ");
            y = Double.parseDouble(sc.nextLine());
            resposta = mm(x, y);
            System.out.printf("energia eletrica: %.2f j\n", resposta);

        } else if (opcao.equals("7")) {
            System.out.print("massa (kg): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("velocidade (m/s): ");
            y = Double.parseDouble(sc.nextLine());
            resposta = 0.5 * mm(x, mm(y, y));

            System.out.printf("energia cinetica: %.2f j\n", resposta);
        } else if (opcao.equals("8")) {
            System.out.print("massa (kg): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("altura (m): ");
            y = Double.parseDouble(sc.nextLine());
            System.out.print("gravidade (m/s²): ");
            z = Double.parseDouble(sc.nextLine());
            resposta = mm(x, mm(y, z));
            System.out.printf("energia potencial: %.2f j\n", resposta);

        } else if (opcao.equals("9")) {
            System.out.print("forca (n): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("deslocamento (m): ");
            y = Double.parseDouble(sc.nextLine());
            System.out.print("angulo (graus): ");
            z = Double.parseDouble(sc.nextLine());
            resposta = mm(x, mm(y, Math.cos(Math.toRadians(z))));
            System.out.printf("trabalho: %.2f j\n", resposta);

        } else if (opcao.equals("10")) {
            System.out.print("massa (kg): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("calorespostapecifico (j/kgk): ");
            y = Double.parseDouble(sc.nextLine());
            System.out.print("variacao (k): ");
            z = Double.parseDouble(sc.nextLine());
            resposta = mm(x, mm(y, z));
            System.out.printf("calor sensivel: %.2f j\n", resposta);

        } else if (opcao.equals("11")) {
            System.out.print("calor (j): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("massa (kg): ");
            y = Double.parseDouble(sc.nextLine());
            System.out.print("variacao (k): ");
            z = Double.parseDouble(sc.nextLine());
            resposta = dd(x, mm(y, z));
            System.out.printf("calor especifico: %.2f j/kgk\n", resposta);

        } else if (opcao.equals("12")) {
            System.out.print("comprimento (m): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("frequencia (hz): ");
            y = Double.parseDouble(sc.nextLine());
            resposta = mm(x, y);
            System.out.printf("velocidade de onda: %.2f m/s\n", resposta);

        } else if (opcao.equals("13")) {
            System.out.print("forca (n): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("area (m²): ");
            y = Double.parseDouble(sc.nextLine());
            resposta = dd(x, y);
            System.out.printf("prespostasao: %.2f pa\n", resposta);

        } else if (opcao.equals("14")) {
            System.out.print("massa (kg): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("volume (m³): ");
            y = Double.parseDouble(sc.nextLine());
            resposta = dd(x, y);
            System.out.printf("densidade: %.2f kg/m³\n", resposta);

        } else if (opcao.equals("15")) {
            System.out.print("forca (n): ");
            x = Double.parseDouble(sc.nextLine());
            System.out.print("tempo (s): ");
            y = Double.parseDouble(sc.nextLine());
            resposta = mm(x, y);
            System.out.printf("impulso: %.2f n·s\n", resposta);

        } else {
            System.out.println("opcao invalida");
        }
        sc.close();
    }
}
