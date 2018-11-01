/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaquelinecsv;

/**
 *
 * @author thiago.dias
 */
public class Funcionario {
    private Integer Codigo;
    private String Nome;
    private Float Salario;
    private String Admissao;
    private String Cargo;

    public Funcionario(Integer Codigo, String Nome, String Cargo, String Admissao, Float Salario) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Salario = Salario;
        this.Admissao = Admissao;
        this.Cargo = Cargo;
    }
    
    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Float getSalario() {
        return Salario;
    }

    public void setSalario(Float Salario) {
        this.Salario = Salario;
    }

    public String getAdmissao() {
        return Admissao;
    }

    public void setAdmissao(String Admissao) {
        this.Admissao = Admissao;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Funcionario)) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        
        if (this.getCodigo().equals(other.getCodigo()) &&
            this.getNome().equals(other.getNome()) &&
            this.getCargo().equals(other.getCargo()) &&
            this.getSalario().equals(other.getSalario()) &&
            this.getAdmissao().equals(other.getAdmissao())
            )
            return true;
        else
            return false;
    }
    
}
