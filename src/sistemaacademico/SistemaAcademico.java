package sistemaacademico;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SistemaAcademico {

    
    public static void main(String[] args) {
        
        boolean sair = false;
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        OpcoesSistema opcoes = new OpcoesSistema();
        Curso curso = null;
        
        while(sair == false){
            int op1 = opcoes.menuPrincipal();
            if(op1==1){
                int op2 = opcoes.menuSecundario();
                if(op2==1){
                    curso = opcoes.cadastrarCurso();
                    cursos.add (curso);
                    JOptionPane.showMessageDialog(null, opcoes.imprimeCurso(cursos));
                }else if(op2==2){
                    opcoes.alteraCurso(cursos);
                }else if(op2==3){
                    
                }else if(op2==4){
                    continue;
                }
            }else if(op1==2){
                int op2 = opcoes.menuSecundario();
                if(op2==1){
                    
                }else if(op2==2){
                    
                }else if(op2==3){
                    
                }else if(op2==4){
                    continue;
                } 
            }else if(op1==3){
                int op2 = opcoes.menuSecundario();
                if(op2==1){
                    
                }else if(op2==2){
                    
                }else if(op2==3){
                    
                }else if(op2==4){
                    continue;
                }
            }else if(op1==4){
                
            }else if(op1==5){
                
            }else if(op1==6){
                
            }else if(op1==7){
                sair = true;
                continue;
            }else{ 
                JOptionPane.showMessageDialog(null, "Opção Inválida", "Sistema Acadêmico", JOptionPane.ERROR_MESSAGE);
            }
            
            if(op1 >=4 && op1 <=6){
                sair = opcoes.continuaOperacao();
            }
        }
    }
}
