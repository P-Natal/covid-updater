package com.gpms.covidupdater.api.to;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonInclude
public class NewsItemTO {

    @JsonProperty("id")
    int id;

    @JsonProperty("tipo")
    String tipo;

    @JsonProperty("titulo")
    String titulo;

    @JsonProperty("introdução")
    String introdução;

    @JsonProperty("data_publicacao")
    String data_publicacao;

    @JsonProperty("produto_id")
    int produto_id;

    @JsonProperty("produtos")
    String produtos;

    @JsonProperty("editorias")
    String editorias;

    @JsonProperty("imagens")
    String imagens;

    @JsonProperty("produtos_relacionados")
    String produtos_relacionados;

    @JsonProperty("destaque")
    boolean destaque;

    @JsonProperty("link")
    String link;
}
