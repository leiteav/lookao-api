package br.com.lookao.lookao_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest {

  @NotEmpty
  @NotNull
  private String username;

  @NotEmpty
  @NotNull
  private String password;

}
