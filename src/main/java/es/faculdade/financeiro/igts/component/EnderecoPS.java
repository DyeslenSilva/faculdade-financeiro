package es.faculdade.financeiro.igts.component;

import br.com.uol.pagseguro.api.common.domain.builder.AddressBuilder;
import es.faculdade.financeiro.igts.component.model.Endereco;

public class EnderecoPS {

	public AddressBuilder toAddressBuilder(Endereco endereco) {
		return new AddressBuilder()
				.withPostalCode(endereco.getCodigoPostal())
				.withCountry(endereco.getPais())
				.withState(endereco.getEstado())
				.withCity(endereco.getCidade())
				.withComplement(endereco.getComplemento())
				.withDistrict(endereco.getDistrito())
				.withNumber(endereco.getNumero())
				.withStreet(endereco.getRua());
	}
}
