package br.com.ctmait.addressquery.service;

import br.com.ctmait.addressquery.context.model.Address;
import br.com.ctmait.addressquery.processor.QueryProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressQueryServiceImpl implements AddressQueryService<Address>{

    private final QueryProcessor<Address> queryProcessor;

    @Override
    public Address start(Address domainObject) {
        return queryProcessor.execute(domainObject);
    }
}
