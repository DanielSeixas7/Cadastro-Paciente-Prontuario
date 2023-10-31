public class Paciente {
    private String  nome;
    private String sexo;
    private String nascimento;
    private String idade;
    private String estadocivil;
    private String nacionalidade;
    private String cpf;
    private String rg;
    private String naturalidade;
    private String profissao;
    private String tiposanguineo;
    private String mae;
    private String pai;
    private String raca;
    private String email;
    private String numeroCNS;
    private String unidadedereferencia;
    private String medicodereferencia;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    //Método Construtor Cheio
    public Paciente(String nome,String sexo,String nascimento,String idade,String estadocivil,String nacionalidade,String cpf,String rg,String naturalidade,String profissao,String tiposanguineo,String mae,String pai,String raca, String email,String numeroCNS,String unidadedereferencia,String medicodereferencia,String logradouro,String numero,String complemento,String bairro,String cidade,String estado,String cep,String telefone){
      this.nome = nome;
      this.sexo = sexo;
      this.nacionalidade = nascimento;
      this.idade = idade;
      this.estadocivil = estadocivil;
      this.nacionalidade = nacionalidade;
      this.cpf = cpf;
      this.rg = rg;
      this.naturalidade = naturalidade;
      this.profissao = profissao;
      this.tiposanguineo = tiposanguineo;
      this.mae = mae;
      this.pai = pai;
      this.raca = raca;
      this.email = email;
      this.numeroCNS = numeroCNS;
      this.unidadedereferencia = unidadedereferencia;
      this.medicodereferencia = medicodereferencia;
      this.logradouro = logradouro;
      this.numero = numero;
      this.complemento = complemento;
      this.bairro = bairro;
      this.cidade = cidade;
      this.estado = estado;
      this.cep = cep;
      this.telefone = telefone;
    }
    // Método Construtor Vazio
    public Paciente(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTiposanguineo() {
        return tiposanguineo;
    }

    public void setTiposanguineo(String tiposanguineo) {
        this.tiposanguineo = tiposanguineo;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCNS() {
        return numeroCNS;
    }

    public void setNumeroCNS(String numeroCNS) {
        this.numeroCNS = numeroCNS;
    }

    public String getUnidadedereferencia() {
        return unidadedereferencia;
    }

    public void setUnidadedereferencia(String unidadedereferencia) {
        this.unidadedereferencia = unidadedereferencia;
    }

    public String getMedicodereferencia() {
        return medicodereferencia;
    }

    public void setMedicodereferencia(String medicodereferencia) {
        this.medicodereferencia = medicodereferencia;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
