package one.digitalinnovation.beerstock.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerType {

    PILSEN("Pilsen"),
    LAGER("Lager"),
    MALZBIER("Malzbier"),
    WITBIER("Witbier"),
    WEISS("Weiss"),
    ALE("Ale"),
    IPA("IPA"),
    APA("APA"),
    BOCK("Bock"),
    PORTER("Porter"),
    STOUT("Stout");


    private final String description;
}
