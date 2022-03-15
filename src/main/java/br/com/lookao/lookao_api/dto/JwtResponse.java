package br.com.lookao.lookao_api.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class JwtResponse {

    final String jwtToken;

}
