package com.example.listadeitems.data

import com.example.listadeitems.model.Live

class DataSource {
    companion object{

        fun createDataSet(): ArrayList<Live>{
            val list = ArrayList<Live>()

            list.add(
                Live(
                    "Paper Coding Session",
                    "Lofi Ghostie",
                    "https://i.ytimg.com/vi/6PRvRaIqazI/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLD8RAZsgD4vInDf9Yi0YUYwrB6SNg",
                    "https://www.youtube.com/watch?v=6PRvRaIqazI"
                )
            )
            list.add(
                Live(
                    "Calm Place Lo-fi Hip Hop",
                    "chilli music",
                    "https://i.ytimg.com/vi/VzhK0pim76Q/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDeuCyrtKVR_R9l20g4TOBa9GdaEQ",
                    "https://www.youtube.com/watch?v=VzhK0pim76Q"
                )
            )
            list.add(
                Live(
                    "Aesthetic beats",
                    "ambition",
                    "https://i.ytimg.com/vi/Xo28eSPwATQ/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAkCM78441SU0rVL2nsrzmj6mD8_Q",
                    "https://www.youtube.com/watch?v=VzhK0pim76Q"
                )
            )
            list.add(
                Live(
                    "Just wanna stay here",
                    "Dreamy",
                    "https://i.ytimg.com/vi/NxSDNogkKX0/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDm5PAL3oPRFrxDiwn8FZR69vJkjQ",
                    "https://www.youtube.com/watch?v=NxSDNogkKX0"
                )
            )
            list.add(
                Live(
                    "Inner city",
                    "The Jazz Hop Café",
                    "https://i.ytimg.com/vi/c3Jl8ZIPcmw/hqdefault.jpg?sqp=-oaymwEcCOADEI4CSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCOS4yxn8oZbra1dQsGb2i79TWyUw",
                    "https://www.youtube.com/watch?v=c3Jl8ZIPcmw"
                )
            )
            list.add(
                Live(
                    "Brawl Stars Lo-fi",
                    "Vitalie",
                    "https://i.ytimg.com/vi/XF-SYeGNYFs/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDNsLTY4ZPJtQ5-OlVJ-poiHNgNsA",
                    "https://www.youtube.com/watch?v=XF-SYeGNYFs"
                )
            )
            list.add(
                Live(
                    "Rainy City",
                    "The Jazz Hop Café",
                    "https://i.ytimg.com/an_webp/3k_a6sQuEIg/mqdefault_6s.webp?du=3000&sqp=CIjU1YkG&rs=AOn4CLDMZfDWWDnX_1VHdc5B5Ey2gW_NFw",
                    "https://www.youtube.com/watch?v=3k_a6sQuEIg&t=57s"
                )
            )

            return list
        }
    }
}