package com.example.repo

import com.example.model.ApiResponse
import com.example.model.Hero

class HeroRepoImpl : HeroRepo {

    //    override val heroes :Map<Int,List<Hero>> by lazy {   mapOf(
//        1 to page1,
//        2 to page2,
//        3 to page3,
//        4 to page4,
//        5 to page5)}
    override val heroes = listOf(
        Hero(
            id = 1,
            name = "Sasuke",
            image = "/images/sasuke.jpg",
            about = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki, Sasuke starts developing his skills. Dissatisfied with his progress, he defects from Konoha so that he can acquire the strength needed to exact his revenge. His years of seeking vengeance and his actions that followed become increasingly demanding, irrational and isolates him from others, leading him to be branded as an international criminal. After learning the truth of his brother's sacrifice, later proving instrumental in ending the Fourth Shinobi World War, and being happily redeemed by Naruto, Sasuke decides to return to Konoha and dedicate his life to help protect the village and its inhabitants, becoming referred to as the Supporting Kage (支う影, Sasaukage, literally meaning: Supporting Shadow).",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("Fugaku", "Mikoto", "Itachi ", "Sarada ", "Sakura"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release",
                "Wind Release",
                "Earth Release", "Water Release", "Yin Release"
            )

        ),
        Hero(
            id = 2,
            name = "Boruto",
            image = "/images/boruto.png",
            about = "Boruto Uzumaki (うずまきボルト, Uzumaki Boruto) is a shinobi from Konohagakure's Uzumaki clan and a direct descendant of the Hyūga clan through his mother. While initially resentful of his father and his absence since becoming Hokage, Boruto eventually comes to respect his father and duties. Regardless, he vows to instead become a shinobi like his mentor.",
            rating = 5.0,
            power = 95,
            month = "March",
            day = "27rd",
            family = listOf(
                "Minato Namikaze ",
                "Kushina Uzumaki",
                "Naruto Uzumaki ",
                "Hyūga Elder  ",
                "Hiashi Hyūga ",
                "Himawari Uzumaki ",
                "Neji Hyūga"
            ),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release",
                "Wind Release",
                "Water Release"
            )

        ),
        Hero(
            id = 3,
            name = "Amado",
            image = "/images/amado.jpg",
            about = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki, Sasuke starts developing his skills. Dissatisfied with his progress, he defects from Konoha so that he can acquire the strength needed to exact his revenge. His years of seeking vengeance and his actions that followed become increasingly demanding, irrational and isolates him from others, leading him to be branded as an international criminal. After learning the truth of his brother's sacrifice, later proving instrumental in ending the Fourth Shinobi World War, and being happily redeemed by Naruto, Sasuke decides to return to Konoha and dedicate his life to help protect the village and its inhabitants, becoming referred to as the Supporting Kage (支う影, Sasaukage, literally meaning: Supporting Shadow).",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("Fugaku", "Mikoto", "Itachi ", "Sarada ", "Sakura"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release",
                "Wind Release",
                "Earth Release", "Water Release", "Yin Release"
            )
        ),
        Hero(
            id = 4,
            name = "Kakashi",
            image = "/images/kakashi.png",
            about = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki, Sasuke starts developing his skills. Dissatisfied with his progress, he defects from Konoha so that he can acquire the strength needed to exact his revenge. His years of seeking vengeance and his actions that followed become increasingly demanding, irrational and isolates him from others, leading him to be branded as an international criminal. After learning the truth of his brother's sacrifice, later proving instrumental in ending the Fourth Shinobi World War, and being happily redeemed by Naruto, Sasuke decides to return to Konoha and dedicate his life to help protect the village and its inhabitants, becoming referred to as the Supporting Kage (支う影, Sasaukage, literally meaning: Supporting Shadow).",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("Fugaku", "Mikoto", "Itachi ", "Sarada ", "Sakura"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release",
                "Wind Release",
                "Earth Release", "Water Release", "Yin Release"
            )

        ),
        Hero(
            id = 5,
            name = "Boruto",
            image = "/images/Kawaki.jpg",
            about = "Boruto Uzumaki (うずまきボルト, Uzumaki Boruto) is a shinobi from Konohagakure's Uzumaki clan and a direct descendant of the Hyūga clan through his mother. While initially resentful of his father and his absence since becoming Hokage, Boruto eventually comes to respect his father and duties. Regardless, he vows to instead become a shinobi like his mentor.",
            rating = 5.0,
            power = 95,
            month = "March",
            day = "27rd",
            family = listOf(
                "Minato Namikaze ",
                "Kushina Uzumaki",
                "Naruto Uzumaki ",
                "Hyūga Elder  ",
                "Hiashi Hyūga ",
                "Himawari Uzumaki ",
                "Neji Hyūga"
            ),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release",
                "Wind Release",
                "Water Release"
            )

        ),
        Hero(
            id = 6,
            name = "Sasuke",
            image = "/image/sasuke.jpg",
            about = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki, Sasuke starts developing his skills. Dissatisfied with his progress, he defects from Konoha so that he can acquire the strength needed to exact his revenge. His years of seeking vengeance and his actions that followed become increasingly demanding, irrational and isolates him from others, leading him to be branded as an international criminal. After learning the truth of his brother's sacrifice, later proving instrumental in ending the Fourth Shinobi World War, and being happily redeemed by Naruto, Sasuke decides to return to Konoha and dedicate his life to help protect the village and its inhabitants, becoming referred to as the Supporting Kage (支う影, Sasaukage, literally meaning: Supporting Shadow).",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("Fugaku", "Mikoto", "Itachi ", "Sarada ", "Sakura"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release",
                "Wind Release",
                "Earth Release", "Water Release", "Yin Release"
            )
        ),
        Hero(
            id = 7,
            name = "Sasuke",
            image = "/image/sasuke.jpg",
            about = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki, Sasuke starts developing his skills. Dissatisfied with his progress, he defects from Konoha so that he can acquire the strength needed to exact his revenge. His years of seeking vengeance and his actions that followed become increasingly demanding, irrational and isolates him from others, leading him to be branded as an international criminal. After learning the truth of his brother's sacrifice, later proving instrumental in ending the Fourth Shinobi World War, and being happily redeemed by Naruto, Sasuke decides to return to Konoha and dedicate his life to help protect the village and its inhabitants, becoming referred to as the Supporting Kage (支う影, Sasaukage, literally meaning: Supporting Shadow).",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("Fugaku", "Mikoto", "Itachi ", "Sarada ", "Sakura"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release",
                "Wind Release",
                "Earth Release", "Water Release", "Yin Release"
            )

        ),
        Hero(
            id = 8,
            name = "Boruto",
            image = "/image/boruto.jpg",
            about = "Boruto Uzumaki (うずまきボルト, Uzumaki Boruto) is a shinobi from Konohagakure's Uzumaki clan and a direct descendant of the Hyūga clan through his mother. While initially resentful of his father and his absence since becoming Hokage, Boruto eventually comes to respect his father and duties. Regardless, he vows to instead become a shinobi like his mentor.",
            rating = 5.0,
            power = 95,
            month = "March",
            day = "27rd",
            family = listOf(
                "Minato Namikaze ",
                "Kushina Uzumaki",
                "Naruto Uzumaki ",
                "Hyūga Elder  ",
                "Hiashi Hyūga ",
                "Himawari Uzumaki ",
                "Neji Hyūga"
            ),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release",
                "Wind Release",
                "Water Release"
            )

        ),
        Hero(
            id = 9,
            name = "Sasuke",
            image = "/image/sasuke.jpg",
            about = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki, Sasuke starts developing his skills. Dissatisfied with his progress, he defects from Konoha so that he can acquire the strength needed to exact his revenge. His years of seeking vengeance and his actions that followed become increasingly demanding, irrational and isolates him from others, leading him to be branded as an international criminal. After learning the truth of his brother's sacrifice, later proving instrumental in ending the Fourth Shinobi World War, and being happily redeemed by Naruto, Sasuke decides to return to Konoha and dedicate his life to help protect the village and its inhabitants, becoming referred to as the Supporting Kage (支う影, Sasaukage, literally meaning: Supporting Shadow).",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("Fugaku", "Mikoto", "Itachi ", "Sarada ", "Sakura"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release",
                "Wind Release",
                "Earth Release", "Water Release", "Yin Release"
            )
        ),
        Hero(
            id = 10,
            name = "Sarada",
            image = "/image/sarada.jpg",
            about = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki, Sasuke starts developing his skills. Dissatisfied with his progress, he defects from Konoha so that he can acquire the strength needed to exact his revenge. His years of seeking vengeance and his actions that followed become increasingly demanding, irrational and isolates him from others, leading him to be branded as an international criminal. After learning the truth of his brother's sacrifice, later proving instrumental in ending the Fourth Shinobi World War, and being happily redeemed by Naruto, Sasuke decides to return to Konoha and dedicate his life to help protect the village and its inhabitants, becoming referred to as the Supporting Kage (支う影, Sasaukage, literally meaning: Supporting Shadow).",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("Fugaku", "Mikoto", "Itachi ", "Sarada ", "Sakura"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release",
                "Wind Release",
                "Earth Release", "Water Release", "Yin Release"
            )

        ),
        Hero(
            id = 11,
            name = "Naruto",
            image = "/image/naruto.jpg",
            about = "Boruto Uzumaki (うずまきボルト, Uzumaki Boruto) is a shinobi from Konohagakure's Uzumaki clan and a direct descendant of the Hyūga clan through his mother. While initially resentful of his father and his absence since becoming Hokage, Boruto eventually comes to respect his father and duties. Regardless, he vows to instead become a shinobi like his mentor.",
            rating = 5.0,
            power = 95,
            month = "March",
            day = "27rd",
            family = listOf(
                "Minato Namikaze ",
                "Kushina Uzumaki",
                "Naruto Uzumaki ",
                "Hyūga Elder  ",
                "Hiashi Hyūga ",
                "Himawari Uzumaki ",
                "Neji Hyūga"
            ),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release",
                "Wind Release",
                "Water Release"
            )

        ),
        Hero(
            id = 12,
            name = "Ishiki",
            image = "/image/ishiki.jpg",
            about = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki, Sasuke starts developing his skills. Dissatisfied with his progress, he defects from Konoha so that he can acquire the strength needed to exact his revenge. His years of seeking vengeance and his actions that followed become increasingly demanding, irrational and isolates him from others, leading him to be branded as an international criminal. After learning the truth of his brother's sacrifice, later proving instrumental in ending the Fourth Shinobi World War, and being happily redeemed by Naruto, Sasuke decides to return to Konoha and dedicate his life to help protect the village and its inhabitants, becoming referred to as the Supporting Kage (支う影, Sasaukage, literally meaning: Supporting Shadow).",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("Fugaku", "Mikoto", "Itachi ", "Sarada ", "Sakura"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release",
                "Wind Release",
                "Earth Release", "Water Release", "Yin Release"
            )
        ),
        Hero(
            id = 13,
            name = "Mitsuki",
            image = "/image/mitsuki.jpg",
            about = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki, Sasuke starts developing his skills. Dissatisfied with his progress, he defects from Konoha so that he can acquire the strength needed to exact his revenge. His years of seeking vengeance and his actions that followed become increasingly demanding, irrational and isolates him from others, leading him to be branded as an international criminal. After learning the truth of his brother's sacrifice, later proving instrumental in ending the Fourth Shinobi World War, and being happily redeemed by Naruto, Sasuke decides to return to Konoha and dedicate his life to help protect the village and its inhabitants, becoming referred to as the Supporting Kage (支う影, Sasaukage, literally meaning: Supporting Shadow).",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("Fugaku", "Mikoto", "Itachi ", "Sarada ", "Sakura"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release",
                "Wind Release",
                "Earth Release", "Water Release", "Yin Release"
            )

        ),
        Hero(
            id = 14,
            name = "Urashiki",
            image = "/images/urashiki.jpg",
            about = "Boruto Uzumaki (うずまきボルト, Uzumaki Boruto) is a shinobi from Konohagakure's Uzumaki clan and a direct descendant of the Hyūga clan through his mother. While initially resentful of his father and his absence since becoming Hokage, Boruto eventually comes to respect his father and duties. Regardless, he vows to instead become a shinobi like his mentor.",
            rating = 5.0,
            power = 95,
            month = "March",
            day = "27rd",
            family = listOf(
                "Minato Namikaze ",
                "Kushina Uzumaki",
                "Naruto Uzumaki ",
                "Hyūga Elder  ",
                "Hiashi Hyūga ",
                "Himawari Uzumaki ",
                "Neji Hyūga"
            ),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release",
                "Wind Release",
                "Water Release"
            )

        ),
        Hero(
            id = 15,
            name = "Orochimaru",
            image = "/image/orochimaru.jpg",
            about = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki, Sasuke starts developing his skills. Dissatisfied with his progress, he defects from Konoha so that he can acquire the strength needed to exact his revenge. His years of seeking vengeance and his actions that followed become increasingly demanding, irrational and isolates him from others, leading him to be branded as an international criminal. After learning the truth of his brother's sacrifice, later proving instrumental in ending the Fourth Shinobi World War, and being happily redeemed by Naruto, Sasuke decides to return to Konoha and dedicate his life to help protect the village and its inhabitants, becoming referred to as the Supporting Kage (支う影, Sasaukage, literally meaning: Supporting Shadow).",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("Fugaku", "Mikoto", "Itachi ", "Sarada ", "Sakura"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release",
                "Wind Release",
                "Earth Release", "Water Release", "Yin Release"
            )
        )

    )

    override suspend fun getAllHeroes(): ApiResponse {
        return ApiResponse(success = true, message = "ok", heroes = heroes)
    }

    //, prevPage = calculatePage(page=page)["prePage"],nextPage =calculatePage(page=page)["nextPage"]
//   private fun calculatePage(page:Int):Map<String,Int?>{
//       var prevPage :Int?=page
//       var nexePage:Int ?=page
//       if (page in 1..4){
//           nexePage = nexePage?.plus(1)
//       }
//       if (page in 2..5){
//           prevPage=prevPage?.minus(1)
//       }
//       if (page == 1){
//           prevPage = null
//       }
//       if (page == 5){
//           nexePage =null
//       }
//       return mapOf("prevPage" to prevPage ,"nextPage" to nexePage)
//   }
    override suspend fun searchHeroes(name: String): ApiResponse {
        TODO("Not yet implemented")
    }
}