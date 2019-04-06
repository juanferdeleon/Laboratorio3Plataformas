package models

class Places{

    var places: ArrayList<Place> = ArrayList()

    init {
        val antiguaInfo = Place("Antigua Guatemala",
        "La belleza de esta ciudad, Patrimonio Cultural de la Humanidad por la UNESCO,  radica en cada uno de sus detalles. \nLos que la visitan quedan maravillados con sus atractivos históricos. Antiguos templos y monasterios forman parte de su riqueza.",
        "Fundada el 10 de marzo de 1543, La Antigua Guatemala fue declarada Patrimonio Cultural de la Humanidad por la Unesco en el año 1979. Esta bella y mágica ciudad colonial guarda casi quinientos años de historia, con un clima privilegiado y una excepcional vista hacia los volcanes de Fuego y Acatenango.\n" +
                "\n\n" +
                "Fue construida en el Valle de Panchoy y nombrada la tercera sede de la capital de Guatemala. En esta ciudad el tiempo se detuvo y quedó atrapado en las gruesas paredes de sus templos, sus monasterios y sus casas coloniales. Esta colorida población aún conserva edificaciones restauradas del siglo XVI y puede ser recorrida a pie a través de sus calles empedradas.\n" +
                "\n\n" +
                "Desde el Cerro de la Cruz, ubicado al nororiente de la urbe, La Antigua Guatemala se ve impresionante. Admirable es también el emblemático Volcán de Agua, que ha sido testigo de las glorias y caídas de la población. La belleza de esta ciudad radica en cada uno de sus detalles. Los que la visitan quedan maravillados con sus atractivos históricos, antiguos templos y monasterios que forman parte de su legado.\n" +
                "Luego de haber sufrido varios terremotos, ha permanecido detenida en el tiempo y es admirada por sus calles empedradas, casas coloniales, monumentos civiles, leyendas y tradiciones.\n" +
                "\n\n" +
                "Los principales atractivos turísticos de la Antigua son El Palacio de los Capitanes Generales, El Convento y Arco de Santa Catalina, La Plaza Mayor, El Museo de Jade, La Antigua Catedral de Guatemala, el museo de la Universidad de San Carlos, la Ruta Santa del Hermano Pedro, entre otros. La ciudad también es rica en artesanías tales como tejidos típicos, cerámica, productos de plata y oro, cerería, productos metálicos, dulces típicos y gastronomía.\n" +
                "\n\n" +
                "Para llegar a La Antigua Guatemala desde la Ciudad de Guatemala debe tomar la carretera CA-1, saliendo por la Calzada Roosevelt, pasando por San Lucas Sacatepéquez y girar hacia la derecha. La Antigua está situada a 40 Kilómetros del centro de la ciudad capital."
        )
        val tikalInfo = Place("Tikal",
            "Con 16 km², la antigua ciudad Maya de Tikal es debido a sus riquezas culturales y naturales de un valor universal excepcional y fue declarado como el primer sitio Patrimonio Mundial Cultural y Natural de la humanidad en 1979 por la UNESCO.",
            "La antigua ciudad Maya de Tikal, ubicada en el municipio de Flores, departamento de Petén, constituye el asentamiento prehispánico más extenso en Guatemala, cuya población pudo haber alcanzado los 100,000 habitantes durante su época de mayor esplendor. Tikal cuenta con alrededor de 5,000 edificios prehispánicos en un área de aproximadamente 16 km², de los cuales únicamente el 5% se encuentra restaurado y habilitado para su visitación. La ciudad representa una antigua capital que dominó un vasto territorio durante el período Clásico. El nombre de Tikal significa Ciudad de las Voces. El Parque Nacional Tikal fue creado en 1955 con una extensión de 575.86 km² (55,005 ha).\n" +
                    "\n" +
                    "Tikal se caracteriza por la monumentalidad de sus edificios, con una ocupación continua de 1,500 años (del 600 a.C. al 900 d.C.), época durante la cual ejerció un papel protagónico en la organización social y política de las tierras bajas. Tikal es uno de los máximos exponentes del estilo arquitectónico típico de las tierras bajas centrales mayas, mostrando exquisitos ejemplos de templos en forma de pirámides escalonadas tales como, el Gran Jaguar (Templo I), el Templo de las Máscaras (Templo II), el Templo de la Serpiente Bicéfala (Templo IV) y el Templo de las Inscripciones (Templo VI), así como plazas, conjuntos conmemorativos del Mundo Perdido, juegos de pelota, complejos de pirámides gemelas, una enorme colección de monumentos tallados y gran cantidad de sitios periféricos a su alrededor.\n" +
                    "\n" +
                    "Tikal presenta una larga secuencia histórica relatada en sus estelas y altares con una sucesión directa de la dinastía real. Debido a sus riquezas culturales y naturales de valor universal excepcional, en 1979 fue declarado por la UNESCO como el primer sitio Patrimonio Mundial Cultural y Natural de la Humanidad, con una muestra significativa de selva subtropical húmeda, hábitat de numerosas especies de flora y fauna.\n" +
                    "\n" +
                    "En la actualidad, Tikal es uno de los destinos turísticos más importantes de Guatemala y uno de los sitios de mayor interés para los observadores de aves."
            )
        val atitlanInfo = Place("Atitlan",
            "Uno de los atractivos turísticos más visitados en Guatemala. A orillas del lago se sitúan los volcanes de Atitlán, Tolimán y San Pedro La Laguna (“Los Tres Gigantes”), formando así un paisaje impresionante.",
            "Situado en el departamento de Sololá, el Lago de Atitlán es uno de los atractivos turísticos más visitados en Guatemala, y fue nominado como una de las siete maravillas del mundo. Es considerado como el lago más bello del mundo, y también se concibe como uno de los sitios más singulares. El lago tiene una extensión de 130 Km2, y el color de sus aguas varía del azul profundo al verde. El lago, formado hace aproximadamente 84,000 años producto de una erupción volcánica, se encuentra a 1,500 metros sobre el nivel del mar, con una longitud de 18 kilómetros y una profundidad hasta de 341 metros, convirtiéndolo así en el lago más profundo de Centroamérica.\n" +
                    "\n" +
                    "Los cerros y volcanes alrededor del lago ofrecen bosques densos y tupidos, donde el senderismo se puede practicar sin problemas, pudiéndose observar una gran variedad de aves, desde los poco tímidos pájaros carpinteros, hasta el Quetzal, ave nacional.\n" +
                    "\n" +
                    "A orillas del lago se sitúan los volcanes de Atitlán, Tolimán y San Pedro La Laguna (“Los Tres Gigantes”), formando así un paisaje impresionante. Alrededor del lago pueden visitarse los municipios de Santiago Atitlán, San Lucas Tolimán, San Antonio Palopó, Santa Catarina Palopó, Panajachel y San Pedro La Laguna. Muchos de los habitantes de estos pueblos son descendientes de los grupos cakchiqueles y tzutuhiles. Los pueblos ofrecen diferentes ambientes a los turistas, desde la paz característica de Santa Cruz La Laguna y San Pedro La Laguna, lugares muy visitados, hasta la atmósfera festiva de Panajachel, el punto más popular de Sololá. También podemos encontrar todo tipo de artesanías como tejidos, vasijas, cadenas, pulseras, tambores y hamacas, entre otras. Se puede llegar a San Pedro La Laguna, Santa Clara La Laguna y el resto de pueblos por tierra, sin embargo, por la cantidad de opciones de hospedaje en Panajachel, suele ser más conveniente llegar hasta allá, y desde ahí partir en lancha a los pueblos alrededor. El recorrido desde la ciudad de Guatemala hasta el Lago de Atitlán lleva más o menos dos horas con cuarenta minutos."
        )

        places.add(antiguaInfo)
        places.add(tikalInfo)
        places.add(atitlanInfo)

    }

}