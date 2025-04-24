package information_expert;

import java.util.List;

public class Aluno {
  private String name;
  private List<Double> notas;

  public Aluno(String name, List<Double> notas) {
    this.name = name;
    this.notas = notas;
  }

  public double calcularMedia() {
    double totalNotas = 0;
    for (double n : notas) {
      totalNotas += n;
    }
    return notas.isEmpty() ? 0 : totalNotas / notas.size();
  }

}
