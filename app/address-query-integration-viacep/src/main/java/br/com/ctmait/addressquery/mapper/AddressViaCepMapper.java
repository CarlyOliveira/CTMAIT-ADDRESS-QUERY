package br.com.ctmait.addressquery.mapper;

import br.com.ctmait.addressquery.context.model.Address;
import br.com.ctmait.addressquery.payload.out.ViaCepPayloutOut;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AddressViaCepMapper {

    @Mapping(source = "viaCepPayloutOut.cep", target = "cep")
    @Mapping(source = "viaCepPayloutOut.logradouro", target = "logradouro")
    @Mapping(source = "viaCepPayloutOut.complemento", target = "complemento")
    @Mapping(source = "viaCepPayloutOut.bairro", target = "bairro")
    @Mapping(source = "viaCepPayloutOut.localidade", target = "localidade")
    @Mapping(source = "viaCepPayloutOut.uf", target = "uf")
    void  setViaCepPayloutOutInAdress (ViaCepPayloutOut viaCepPayloutOut, @MappingTarget Address address);


}
