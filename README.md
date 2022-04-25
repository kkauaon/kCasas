# kCasas
## ⚠️ Requer no mínimo Java 11 ⚠️
Plugin de casas/homes, 100% customizável.<br />
O plugin não está disponível para download, pois ainda está em desenvolvimento, nem todas as funções citadas estão disponíveis no momento.

### Funções
- [x] Setar e teletransportar para suas casas.
- [x] Desabilitar o sistema em certos mundos.
- [x] Suporte ao [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/).
- [x] Sistema de rastrear suas casas.
- [x] Limite de casas via permissões. 
- [x] 100% customizável 

### Comandos
`[]` - Argumento opcional<br />
`<>` - Argumento obrigatório

|       Comando       | Permissão        | Descrição |
|:-------------------:|------------------|-----------|
| `/casas`            | kcasas.ver       | Ver suas casas salvas |
| `/setarcasa [nome]` | kcasas.setarcasa | Setar uma nova casa |
| `/casa [nome]`      | kcasas.ir        | Teletransportar até sua casa |
| `/kcasas`           | kcasas.admin     | Informações do Plugin |

### Suporte
- ✅ O plugin suporta a versão
- ❌ O plugin não funcionará na versão

| Versão | Suporte |
|:-------:|:-------:|
|1.18.x   |❌|
|1.17.x   |❌|
|1.16.x   |✅|
|1.15.x   |❌|
|1.14.x   |❌|
|1.13.x   |❌|
|1.12.x   |❌|
|1.11.x   |❌|
|1.10.x   |❌|
|1.9.x    |❌|
|1.8.x    |❌|

### Building
Você precisa ter o [Maven](https://maven.apache.org/) e o Java 11 instalado e configurado na sua máquina.

Use o comando `mvn install`. O JAR do plugin é exportado na pasta `target`.
