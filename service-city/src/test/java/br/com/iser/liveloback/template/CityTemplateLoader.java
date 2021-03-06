package br.com.iser.liveloback.template;

import br.com.iser.liveloback.constant.TestConstant;
import br.com.iser.liveloback.model.City;
import br.com.iser.liveloback.model.dto.CityDTO;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class CityTemplateLoader implements TemplateLoader {

   @Override
   public void load() {

      Fixture.of(City.class).addTemplate(TestConstant.CITY_ENTITY, new Rule() {
         {
            add("idCity", 1);
            add("state", "PR");
            add("name", "Curitiba");
         }
      });

      Fixture.of(City.class).addTemplate(TestConstant.CITY_RANDOM_ENTITY, new Rule() {
         {
            add("idCity", random(Integer.class, range(1, 200)));
            add("state", random("RS", "RJ", "PR"));
            add("name", random("Rio Grande", "Rio de Janeiro", "Curitiba"));
         }
      });

      Fixture.of(CityDTO.class).addTemplate(TestConstant.CITY_RANDOM_DTO, new Rule() {
         {
            add("idCity", random(Integer.class, range(1, 200)));
            add("state", random("RS", "RJ", "PR", "SP"));
            add("name", random("Rio Grande", "Rio de Janeiro", "Curitiba", "Campinas"));
         }
      });

      Fixture.of(CityDTO.class).addTemplate(TestConstant.CITY_DTO, new Rule() {
         {
            add("idCity", random(Integer.class, range(1, 200)));
            add("state", random("RS", "RJ", "PR", "SP"));
            add("name", random("Rio Grande", "Rio de Janeiro", "Curitiba", "Campinas"));
         }
      });
   }
};
