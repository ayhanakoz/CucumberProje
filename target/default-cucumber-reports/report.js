$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/dbcreate.feature");
formatter.feature({
  "name": "Tabloda Veri Create Etme",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dbcreate"
    }
  ]
});
formatter.scenario({
  "name": "kullanici tabloda yeni bir reservasyon olusturur",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dbcreate"
    }
  ]
});
formatter.step({
  "name": "kullanici dbutils ile veritabanina baglanir",
  "keyword": "Given "
});
formatter.match({
  "location": "database_stepdefinitions.DbUpdateStepDef.kullanici_dbutils_ile_veritabanina_baglanir()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "kullanici yeni bir rezervasyon olusturur",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});