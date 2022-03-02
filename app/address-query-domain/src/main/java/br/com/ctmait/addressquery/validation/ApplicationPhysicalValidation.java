package br.com.ctmait.addressquery.validation;

@FunctionalInterface
public interface ApplicationPhysicalValidation<R> {
    Boolean validate(final R domainModel);
}