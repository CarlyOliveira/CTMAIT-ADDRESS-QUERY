package br.com.ctmait.addressquery.processor.query;

import br.com.ctmait.addressquery.client.ViaCepClient;
import br.com.ctmait.addressquery.context.model.Address;
import br.com.ctmait.addressquery.mapper.AddressViaCepMapper;
import br.com.ctmait.addressquery.processor.QueryProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressQueryProcessorImpl implements QueryProcessor<Address> {

    private final ViaCepClient viaCepClient;
    private final AddressViaCepMapper addressViaCepMapper;

    @Override
    public Address execute(Address address) {
        addressViaCepMapper.setViaCepPayloutOutInAdress(viaCepClient.getCepViaCep(address.getCep()).getBody(), address);
        return address;
    }
}
