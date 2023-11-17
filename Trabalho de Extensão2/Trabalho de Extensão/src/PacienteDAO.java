import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet ;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PacienteDAO {
    public void adicionar(Paciente obj )throws Exception {
        String sql = "INSERT INTO paciente(nome,sexo,nascimento,idade,estadocivil,nacionalidade,cpf,rg,naturalidade,profissao,tiposanguineo,mae,pai,raca,email,numeroCNS,unidadedereferencia,medicodereferencia,logradouro,numero,complemento,bairro,cidade,estado,cep,telefone)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
        try{
            conn = Conexao.getConnection();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1,obj.getNome());
            pstm.setString(2,obj.getSexo()) ;
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
        }finally {
            try{
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
    public Paciente consultar (String chave) throws ClassNotFoundException {
        Paciente paciente = null;
        try {
            Connection conn = Conexao.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Paciente WHERE CPF = ?");
            ps.setString(1, chave);
            ResultSet r1 = ps.executeQuery();
            if (r1.next()) {
                paciente = new Paciente(r1.getString("nome"), r1.getString("sexo"), r1.getString("nascimento"), r1.getString("idade"), r1.getString("estadocivil"), r1.getString("nacionalidade"), r1.getString("cpf"), r1.getString("rg"), r1.getString("naturalidade"), r1.getString("profissao"), r1.getString("tiposanguineo"), r1.getString("mae"), r1.getString("pai"), r1.getString("raca"), r1.getString("email"), r1.getString("numerocns"), r1.getString("unidadedereferencia"), r1.getString("medicodereferencia"), r1.getString("logradouro"), r1.getString("numero"), r1.getString("complemento"), r1.getString("bairro"), r1.getString("cidade"), r1.getString("estado"), r1.getString("cep"), r1.getString("telefone"));
                
            }
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace(); //Trata o erro apropriadamente
        }
        return paciente;
    }
    // Método para LISTAR todos os pacientes na tabela "Pacientes"
    public List<Paciente> listartodosPacientes() throws SQLException {
        List<Paciente> pacientes = new ArrayList<>();
        return null;
    }
    // Método para Alterar dados do paciente
    public void alterar(Paciente obj)throws Exception {
        String sql = "UPDATE INTO paciente(nome,sexo,nascimento,idade,estadocivil,nacionalidade,cpf,rg,naturalidade,profissao,tiposanguineo,mae,pai,raca,email,numeroCNS,unidadedereferencia,medicodereferencia,logradouro,numero,complemento,bairro,cidade,estado,cep,telefone)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;
    
    try {
        
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1,obj.getNome());
            pstm.setString(2,obj.getSexo()) ;
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
            JOptionPane.showConfirmDialog(null, "Erro ao atualizar dados "+ e.toString());
        }finally {
            try{
                if(pstm!=null){
                    JOptionPane.showMessageDialog(null, "Atualização gravada com sucesso!!!");
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

    boolean excluir(String cpf) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        PreparedStatement stmt = null;
        
        try{
            connection = Conexao.getConnection(); //obtém conexão com o banco de dados
            
            //Cria a instrução SQL para excluir o paciente com o cpf fornecido.
            String sql = "DELETE FROM paciente Where cpf = ?";
            
            //Prepara a declaração SQL com o cpf fornecido.
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, cpf);
            
            //Executa a exclusão.
            int rowsAffected = stmt.executeUpdate();
            
            //Verifica se a exclusão foi bem-sucedidada (verificando o número de linhas afetadas.
            if(rowsAffected > 0) {
                return true; //Exclusão bem-sucedida
            }else {
                return false; //Nenhum registro foi excluído(paciente não encontrado)
            }
        }finally {
           //Fecha a declaração e a conexão, mesmo em caso de exceção
           if (stmt != null) {
           stmt.close();
           }
           if (connection != null) {
            connection.close();
           }
        } 
    }

    boolean atualizar(Paciente pacienteAtualizado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}    


