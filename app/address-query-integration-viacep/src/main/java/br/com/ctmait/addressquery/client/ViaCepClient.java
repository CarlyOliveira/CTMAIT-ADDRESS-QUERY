package br.com.ctmait.addressquery.client;

import br.com.ctmait.addressquery.payload.out.ViaCepPayloutOut;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "${viacep.url}", name = "viacep")
public interface ViaCepClient {

        @GetMapping(value = "${viacep.url.json}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<ViaCepPayloutOut> getCepViaCep(@PathVariable("cep") String cep);
}
