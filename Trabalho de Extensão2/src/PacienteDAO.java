import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet ;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PacienteDAO {
        public void adicionar(Paciente obj ) throws Exception{
            String  sql = "INSERT INTO paciente(nome,sexo,nascimento,idade,estadocivil,nacionalidade,cpf,rg,naturalidade,profissao,tiposanguineo,mae,pai,raca,email,numeroCNS,unidadedereferencia,medicodereferencia,logradouro,numero,complemento,bairro,cidade,estado,cep,telefone)VALUES(?,?,?)";
            Connection conn = null;
            PreparedStatement pstm = null;
            try{
                conn = Conexao.getConnection();
                pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1,obj.getNome());
            pstm.setString(2,obj.getSexo());
            pstm.setString(3,obj.getNascimento());
            pstm.setString(4,obj.getIdade());
            pstm.setString(5,obj.getEstadocivil());
            pstm.setString(6,obj.getNacionalidade());
            pstm.setString(7,obj.getCpf());
            pstm.setString(8,obj.getRg());
            pstm.setString(9,obj.getNaturalidade());
            pstm.setString(10,obj.getProfissao());
            pstm.setString(11,obj.getTiposanguineo());
            pstm.setString(12,obj.getMae());
            pstm.setString(13,obj.getPai());
            pstm.setString(14,obj.getRaca());
            pstm.setString(15,obj.getEmail());
            pstm.setString(16,obj.getNumeroCNS());
            pstm.setString(17,obj.getUnidadedereferencia());
            pstm.setString(18,obj.getMedicodereferencia());
            pstm.setString(19,obj.getLogradouro());
            pstm.setString(20,obj.getNumero());
            pstm.setString(21,obj.getComplemento());
            pstm.setString(22,obj.getBairro());
            pstm.setString(23,obj.getCidade());
            pstm.setString(24,obj.getEstado());
            pstm.setString(25,obj.getCep());
            pstm.setString(26,obj.getTelefone());
            pstm.execute();
            }catch (SQLException e){
                JOptionPane.showConfirmDialog(null, "Erro ao salvar dados "+ e.toString());
            }finally{
                try {
                 if(pstm!=null){
                    JOptionPane.showMessageDialog(null, "Registro gravado com sucesso!!!");
                    pstm.close();
                }
                if(conn!=null){
                    conn.close();
                }
            }catch (Exception e){
               System.out.println("Erro ao salvar dados "+ e.getMessage().toLowerCase());
            }       
        }
    }
}