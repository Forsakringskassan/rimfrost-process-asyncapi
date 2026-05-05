# rimfrost-process-asyncapi
Rimfrost Process Async API


## Felhantering

`HandlaggningResponseMessageData` innehåller ett nullable `error`-fält av typen
`HandlaggningErrorInformation` med `felkod` och `felmeddelande`.
Fältet sätts endast när `resultat` är `"FEL"`, annars är det null.
