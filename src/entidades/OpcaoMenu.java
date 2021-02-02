package entidades;

public class OpcaoMenu {
    private String descricao;
    private String atalho;



    public OpcaoMenu(String atalho, String descricao) {
        this.atalho = atalho;
        this.descricao = descricao;
    }



    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAtalho() {
        return atalho;
    }

    public void setAtalho(String atalho) {
        this.atalho = atalho;
    }




}


