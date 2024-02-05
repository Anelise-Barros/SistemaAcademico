package sistemaacademico;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OpcoesSistema {

    public int menuPrincipal() {
        String strOp1 = JOptionPane.showInputDialog("1 - Curso\n2 - Disciplina\n3 - Aluno\n4 - Matricular Aluno\n5 - Cadastrar Avaliação\n6 - Histórico Escolar\n7 - Sair\nDigite a opção desejada: ");
        return Integer.parseInt(strOp1);
    }

    public int menuSecundario() {
        String strOp2 = JOptionPane.showInputDialog("1 - Cadastrar\n2 - Alterar\n3 - Remover\n4 - Voltar\nDigite a opção desejada: ");
        return Integer.parseInt(strOp2);
    }

    public Curso cadastrarCurso() {
        String codCurso = JOptionPane.showInputDialog("Digite o código do curso: ");
        String nomeCurso = JOptionPane.showInputDialog("Digite o nome do curso: ");
        int maxCurso = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade máxima de alunos no curso: "));
        Curso curso = new Curso(codCurso, nomeCurso, maxCurso);
        return curso;
    }

    public String imprimeCurso(ArrayList<Curso> cursos) {
        String imprime = " ";
        for (int i = 0; i < cursos.size(); i++) {
            imprime += "=========================\n";
            imprime += cursos.get(i).toString();
            imprime += "=========================\n";
        }
        return imprime;
    }

    public void alteraCurso(ArrayList<Curso> cursos) {
        String codCurso = JOptionPane.showInputDialog(null, imprimeCurso(cursos) + "Digite o código do curso que deseja alterar: ");
        Curso busca = buscaCurso(cursos, codCurso);
        if (busca != null) {
            String novoCodCurso = JOptionPane.showInputDialog("Digite o novo código do curso: ");
            String novoNomeCurso = JOptionPane.showInputDialog("Digite o novo nome do curso: ");
            int novoMaxCurso = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova capacidade máxima de alunos no curso: "));

            busca.setCodCurso(novoCodCurso);
            busca.setNomeCurso(novoNomeCurso);
            busca.setMaxCurso(novoMaxCurso);
            JOptionPane.showMessageDialog(null, "Curso Alterado com Sucesso!!! ");
        }else{
            JOptionPane.showMessageDialog(null, "Curso Não Encontrado!!! ");
        }

    }

    public Curso buscaCurso(ArrayList<Curso> cursos, String codCurso) {
        Curso curso = null;
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodCurso().equals(codCurso)) {
                curso = cursos.get(i);
                break;
            } else {
                continue;
            }
        }
        return curso;
    }

    public boolean continuaOperacao() {
        int opCont = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?", "Sistema Acadêmico", JOptionPane.YES_NO_OPTION);
        if (opCont == JOptionPane.NO_OPTION) {
            return true;
        }
        return false;
    }
}
