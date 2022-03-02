package br.com.ctmait.addressquery.resources;

import br.com.ctmait.addressquery.context.model.Address;
import br.com.ctmait.addressquery.mapper.AddressPayloadMapper;
import br.com.ctmait.addressquery.payload.out.AddressQueryPayloadOut;
import br.com.ctmait.addressquery.service.AddressQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AddressQueryResource {

    private final AddressQueryService<Address> addressQueryService;

    private final AddressPayloadMapper addressPayloadMapper;

    @GetMapping("/v1/status")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Address Query está ON");
    }

    @GetMapping("/v1/cep/{cod_cep}")
    public ResponseEntity<AddressQueryPayloadOut> get(@PathVariable("cod_cep") String codCep) {
        Address address = addressPayloadMapper.toAdress(codCep);
        address.accept(addressQueryService::start);
        return ResponseEntity.ok(addressPayloadMapper.toPayloadOut(address));
    }

}
