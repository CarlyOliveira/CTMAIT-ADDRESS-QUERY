package br.com.ctmait.addressquery.validation;

@FunctionalInterface
public interface ApplicationLogicalValidation<R> {
    Boolean validate(final R domainModel);
}