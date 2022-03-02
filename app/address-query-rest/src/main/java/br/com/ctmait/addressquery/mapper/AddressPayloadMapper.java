package br.com.ctmait.addressquery.mapper;

import br.com.ctmait.addressquery.context.model.Address;
import br.com.ctmait.addressquery.payload.out.AddressQueryPayloadOut;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddressPayloadMapper {


    @Mapping(source = "codeCep", target = "cep")
    Address toAdress (String codeCep);

    @Mapping(source = "address.cep", target = "cep")
    @Mapping(source = "address.logradouro", target = "logradouro")
    @Mapping(source = "address.complemento", target = "complemento")
    @Mapping(source = "address.bairro", target = "bairro")
    @Mapping(source = "address.localidade", target = "localidade")
    @Mapping(source = "address.uf", target = "uf")
    @Mapping(source = "address.numero", target = "numero")
    AddressQueryPayloadOut toPayloadOut (Address address);

}
