package controller;

public enum ExemploEnumEstado {
        RIO_DE_JANEIRO ("RJ", "Rio de Janeiro", "Sudeste"),
        SAO_PAULO ("SP", "São Paulo", "Sudeste"),
        CEARA("CE", "Ceará", "Nordeste"),
        BAHIA("BA", "Bahia", "Nordeste"),
        AMAZONAS("AM", "AMAZONAS", "Norte")
        ; //fim dos enuns

        private String sigla;
        private String nome;
        private String regiao;

        private ExemploEnumEstado(String sigla, String nome, String regiao) {
            this.sigla = sigla;
            this.nome = nome;
            this.regiao = regiao;
        }

        //Somente getters
        public String getSigla() {
            return sigla;
        }

        public String getNome() {
            return nome;
        }

        public String getRegiao() {
            return regiao;
        }

}
