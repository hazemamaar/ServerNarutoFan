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
                "Earth Release", "Yin Release"
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
            day = "27th",
            family = listOf(
                "Minato Namikaze ",
                "Kushina Uzumaki",
                "Naruto Uzumaki ",
                "Hyūga Elder  ",
                "Hiashi Hyūga ",
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
            about = "Amado Sanzu (三途アマド, Sanzu Amado) is a former Inner from the organisation Kara and the head of its research and development division. He has since defected to Konohagakure, where he used a mix of bluffs and gifts to gain official citizenship for the Hokage's protection.",
            rating = 4.5,
            power = 90,
            month = "March",
            day = "23rd",
            family = listOf("Akebi Sanzu", "Delta", "Koji Kashin "),
            appearsIn = listOf("Anime", "Manga", "Game"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release"
            )
        ),
        Hero(
            id = 4,
            name = "Kakashi",
            image = "/images/kakashi.png",
            about = "Kakashi Hatake (はたけカカシ, Hatake Kakashi) is a shinobi of Konohagakure's Hatake clan. Famed as Kakashi of the Sharingan (写輪眼のカカシ, Sharingan no Kakashi), he is one of Konoha's most talented ninja, regularly looked to for advice and leadership despite his personal dislike of responsibility. To his students on Team 7, Kakashi emphasises the importance of teamwork; he himself received this lesson, along with the Sharingan, from his childhood friend, Obito Uchiha.",
            rating = 5.0,
            power = 98,
            month = "September",
            day = "15th",
            family = listOf("Sakumo Hatake"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Yang Release", " Fire Release",
                "Wind Release",
                "Earth Release"
            )

        ),
        Hero(
            id = 5,
            name = "Kawaki",
            image = "/images/kawaki.jpg",
            about = "Kawaki (カワキ) is a genin who was raised by Kara to be the future vessel for Isshiki Ōtsutsuki and the key to the fulfilment of their greatest wish.[1] After being brought to Konohagakure by Team 7, he is taken in by Naruto Uzumaki who adopted him as his own. He ultimately develops a bond with his new family, especially Boruto, while working with them to solve the mystery of the Kāma.",
            rating = 4.6,
            power = 93,
            month = "November",
            day = "1st",
            family = listOf(
                "Kokatsu ",
                "Naruto Uzumaki",
                "Boruto Uzumaki",
                "Hanabi Hyūga"
            ),
            appearsIn = listOf("Anime", "Manga", "Game"),
            natureTypes = listOf(
                "Fire Release"
            )

        ),
        Hero(
            id = 6,
            name = "Mitsuki",
            image = "/images/mitsuki.jpg",
            about = "Sasuke Uchiha (うちはサスケ, Uchiha Sasuke) is one of the last surviving members of Konohagakure's Uchiha clan. After his older brother, Itachi, slaughtered their clan, Sasuke made it his mission in life to avenge them by killing Itachi. He is added to Team 7 upon becoming a ninja and, through competition with his rival and best friend, Naruto Uzumaki, Sasuke starts developing his skills. Dissatisfied with his progress, he defects from Konoha so that he can acquire the strength needed to exact his revenge. His years of seeking vengeance and his actions that followed become increasingly demanding, irrational and isolates him from others, leading him to be branded as an international criminal. After learning the truth of his brother's sacrifice, later proving instrumental in ending the Fourth Shinobi World War, and being happily redeemed by Naruto, Sasuke decides to return to Konoha and dedicate his life to help protect the village and its inhabitants, becoming referred to as the Supporting Kage (支う影, Sasaukage, literally meaning: Supporting Shadow).",
            rating = 5.0,
            power = 96,
            month = "July",
            day = "25th",
            family = listOf("Orochimaru", "Log", "Mikazuki"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release",
                "Wind Release"
            )
        ),
        Hero(
            id = 7,
            name = "Momoshiki",
            image = "/images/momoshiki.jpg",
            about = "Momoshiki Ōtsutsuki (大筒木モモシキ, Ōtsutsuki Momoshiki) was a member of the Ōtsutsuki clan's main family, sent to investigate the whereabouts of Kaguya and her God Tree and then attempting to cultivate a new one out of the chakra of the Seventh Hokage. In the process of being killed by Boruto Uzumaki, Momoshiki placed a Kāma on him, allowing his spirit to remain intact through the mark.",
            rating = 4.0,
            power = 89,
            month = "May",
            day = "23rd",
            family = listOf("Kinshiki", "Boruto"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release",
                "Wind Release",
                "Earth Release", "Yin Release"
            )

        ),
        Hero(
            id = 8,
            name = "Code",
            image = "/images/code.jpg",
            about = "Code (コード, Kōdo) is the last active Inner from Kara. Carrying Isshiki Ōtsutsuki's legacy within him, he inherited the Ōtsutsuki Clan's will to become a Celestial Being and continually evolve.",
            rating = 5.0,
            power = 95,
            month = "April",
            day = "25th",
            family = listOf(
                "Ōtsutsuki"
            ),
            appearsIn = listOf("Anime", "Manga", "Game"),
            natureTypes = listOf(
                "Yan Release"
            )

        ),
        Hero(
            id = 9,
            name = "Koji",
            image = "/images/koji.jpg",
            about = "Koji Kashin (果心居士, Kashin Koji) is a clone of Jiraiya that was created by Amado Sanzu for the purpose of killing Isshiki Ōtsutsuki. A former Inner of Kara, he was in charge of the sector on the outskirts of the Land of Fire.",
            rating = 4.0,
            power = 90,
            month = "June",
            day = "30th",
            family = listOf("Amado", "Jiraiya"),
            appearsIn = listOf("Anime", "Manga", "Game"),
            natureTypes = listOf(
                " Fire Release",
                "Earth Release", "Yin Release"
            )
        ),
        Hero(
            id = 10,
            name = "Sakura",
            image = "/images/sakura.jpg",
            about = "Sakura Uchiha (うちはサクラ, Uchiha Sakura, née Haruno (春野)) is a kunoichi of Konohagakure. When assigned to Team 7, Sakura quickly finds herself ill-prepared for the duties of a shinobi. However, after training under the Sannin Tsunade, she overcomes this, and becomes recognised as one of the greatest medical-nin in the world.",
            rating = 3.5,
            power = 86,
            month = "March",
            day = "28th",
            family = listOf("Kizashi", "Mebuki", "Sarada ", "Sasuke"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                " Fire Release",
                "Earth Release", "Yang Release", "Yin Release"
            )

        ),
        Hero(
            id = 11,
            name = "Naruto",
            image = "/images/naruto.jpg",
            about = "Naruto Uzumaki (うずまきナルト, Uzumaki Naruto) is a shinobi of Konohagakure's Uzumaki clan. He became the jinchūriki of the Nine-Tails on the day of his birth — a fate that caused him to be shunned by most of Konoha throughout his childhood. After joining Team Kakashi, Naruto worked hard to gain the village's acknowledgement all the while chasing his dream to become Hokage.",
            rating = 5.0,
            power = 95,
            month = "October",
            day = "10th",
            family = listOf(
                "Minato ",
                "Kushina",
                "Boruto",
            ),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release",
                "Wind Release",
                "Water Release",
                "Yin–Yang Release"
            )

        ),
        Hero(
            id = 12,
            name = "Ishiki",
            image = "/images/ishiki.jpg",
            about = "Isshiki Ōtsutsuki (大筒木イッシキ, Ōtsutsuki Isshiki) was a member of the Ōtsutsuki clan's main family and the leader of Kara.",
            rating = 3.5,
            power = 85,
            month = "December",
            day = "3rd",
            family = listOf("Kawaki", "Jigen"),
            appearsIn = listOf("Anime", "Manga", "Game"),
            natureTypes = listOf(
                "Yin Release", " Fire Release",
            )
        ),
        Hero(
            id = 13,
            name = "Sarada",
            image = "/images/sarada.jpg",
            about = "Sarada Uchiha (うちはサラダ, Uchiha Sarada) is a chūnin-level kunoichi from Konohagakure's Uchiha clan. Because she was raised only by her mother without having her father around, Sarada initially struggles to understand who she is or what she's supposed to be.",
            rating = 4.5,
            power = 90,
            month = "March",
            day = "31st",
            family = listOf("Fugaku", "Mikoto", "Itachi ", "Kizash ", "Sakura"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release",
                "Wind Release", "Yin Release"
            )

        ),
        Hero(
            id = 14,
            name = "Urashiki",
            image = "/images/urashiki.jpg",
            about = "Urashiki Ōtsutsuki (大筒木ウラシキ, Ōtsutsuki Urashiki) was a low-ranking member of the Ōtsutsuki clan's main family, sent to assist Momoshiki and Kinshiki on their mission to investigate Kaguya's whereabouts and gather the chakra of the God Tree on Earth.",
            rating = 5.0,
            power = 97,
            month = "March",
            day = "27th",
            family = listOf(
                "Ōtsutsuki"
            ),
            appearsIn = listOf("Anime"),
            natureTypes = listOf(
                "Lightning Release",
                "Wind Release",
                "Fire Release"
            )

        ),
        Hero(
            id = 15,
            name = "Orochimaru",
            image = "/images/orochimaru.jpg",
            about = "Orochimaru (大蛇丸) is one of Konohagakure's legendary Sannin. With a life-ambition to learn all of the world's secrets, Orochimaru seeks immortality so that he might live all of the lives necessary to accomplish his task.",
            rating = 5.0,
            power = 98,
            month = "October",
            day = "27th",
            family = listOf("Log", "Mitsuki"),
            appearsIn = listOf("Anime", "Manga", "Novel", "Game", "Movie"),
            natureTypes = listOf(
                "Lightning Release", " Fire Release",
                "wood Release", "Yin Release"
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
    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(success = true, message = "ok",heroes=findHeroes(name))
    }

    private fun findHeroes(query: String?): List<Hero> {
        val founded = mutableListOf<Hero>()
        return if (!query.isNullOrEmpty()) {
            heroes.forEach {
                hero ->
                if(hero.name.lowercase().contains(query.lowercase())){
                    founded.add(hero)
                }
            }
            founded
        }else{
            emptyList()
        }
    }
}