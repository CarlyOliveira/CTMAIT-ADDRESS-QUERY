package br.com.ctmait.addressquery.context.model;


import br.com.ctmait.addressquery.context.DomainObject;

import java.util.Objects;
import java.util.function.Consumer;

public class Address implements DomainObject<Address> {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String numero;

    public Address() {
    }

    public Address(String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String numero) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.numero = numero;
    }

    public Address(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
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

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getCep(), address.getCep()) && Objects.equals(getLogradouro(), address.getLogradouro()) && Objects.equals(getComplemento(), address.getComplemento()) && Objects.equals(getBairro(), address.getBairro()) && Objects.equals(getLocalidade(), address.getLocalidade()) && Objects.equals(getUf(), address.getUf()) && Objects.equals(getNumero(), address.getNumero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCep(), getLogradouro(), getComplemento(), getBairro(), getLocalidade(), getUf(), getNumero());
    }

    @Override
    public String toString() {
        return "Address{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    @Override
    public Address getDomainModel() {
        return this;
    }

    public void accept(Consumer<Address> visitor){
        visitor.accept(this);
    }
}