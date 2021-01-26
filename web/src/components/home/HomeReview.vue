<template>
  <div class="mb-12">
    <!-- xs, sm -->
    <div class="hidden-md-and-up">
      <v-sheet outlined tile>
        <v-window dark show-arrows>
          <v-window-item v-for="item in list" :key="item.id">
            <v-img height="270px" class="white--text align-end"
                   gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.5)" :src="item.img">
              <v-card-title>{{ item.title }}</v-card-title>
            </v-img>

            <v-card-actions>
              <v-rating
                  :value="item.rating"
                  color="amber"
                  dense
                  half-increments
                  readonly
                  size="24"></v-rating>
              <div class="grey&#45;&#45;text ml-4">
                ({{item.rating}} / 5)
              </div>
              <v-spacer></v-spacer>

              <v-btn light icon>
                <v-icon>mdi-share-variant</v-icon>
              </v-btn>
            </v-card-actions>

            <v-card-text>
              {{item.contents}}
            </v-card-text>

          </v-window-item>

        </v-window>
      </v-sheet>
    </div>

    <!-- md, lg -->
    <ul class="hidden-sm-and-down">
      <li v-for="(item, idx) in list" xml:space="" xml:lang="" :key="item.id">
        <v-card flat width="100%">
          <div class="d-flex flex-no-wrap justify-space-between">
            <v-avatar size="250" tile class="mt-3 mb-3">
              <v-img :src="item.img" alt="-" />
            </v-avatar>
            <div class="pt-2 align-start flex-fill">
              <v-card-title class="text-md-h6 text-lg-h5">{{ item.title }}</v-card-title>
              <v-card-text>
                {{item.contents}}
              </v-card-text>
            </div>
          </div>
        </v-card>
        <v-divider v-if="idx != (list.length - 1)" />
      </li>
    </ul>
  </div>
  <!-- xl -->
</template>

<script>
    export default {
        name: "HomeReview",
      data: () => ({
        model: null,
        list: [
          {
            id:"813",
            title:'칸쿤여행후기',
            rating:5,
            contents:'11월에 다녀왔는데 이제야 글을 쓰네요 ㅜㅜ 일단 저희는 두바이를 경유하여, 두바이 21시간 일정 → 4박 모리셔스로 다녀왔습니다.\n' +
                'TMI- 저는 사실 패키지 여행을 좋아하지 않았어요. 끌려다니는 일정에 여러 사람 모여서 다녀야 한다는 인식을 가지고 있..',
            img:'http://www.honeymoonlove.co.kr//daum_filebox/pds_exp/KakaoTalk_20200115_132838743.jpg'
          },
          {
            id:"412",
            title:'독일 후기',
            rating:4,
            contents:'칸쿤에서의 첫 4박은 동양인이라곤 찾아볼 수 없었던 현지! 플라야델카르멘에서의 여행!\n' +
                '\n' +
                '너무너무 좋았고, 또 그만큼 현지 분위기속에서 현지 식당도 가고, 바에도 가고 잘 즐겼던 것 같아요!\n' +
                '\n' +
                '그리고 나머지 4박은 힐링하며 보낼수 있었던 TRS유카탄 올인클루..',
            img:'https://cdn.vuetifyjs.com/images/cards/cooking.png'
          },
          {
            id:"123",
            title:'오사카',
            rating:2,
            contents:'많이걸었다.',
            img:'https://cdn.imweb.me/upload/S201612185855798c0088d/58c6a0bc73788.png'
          }
        ]
      }),
    }
</script>

<style scoped>

</style>
