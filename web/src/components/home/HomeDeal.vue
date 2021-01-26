<template>
    <div>
      <div class="hidden-xs-only">
          <v-row>
            <v-col v-for="item in products" :key="item.idx" class="col-xl-3 col-lg-3 col-md-3 col-sm-4">
              <v-card tile class="elevation-0" to="/product/555" style="font-size:12px">
                <v-img contain :src="item.img" width="100%"></v-img>
                <v-card-subtitle class="pb-2 body-2 text-truncate" style="text-align:center">{{ item.title }}</v-card-subtitle>
                <v-card-text align="center" class="justify-center pb-1">
                  {{ item.description || '-' }}
                </v-card-text>
                <v-card-actions v-if="item.isHot || item.isBest || item.isMd" secondary-title class="justify-center pt-0">
                  <div v-if="item.isBest" style="font-size: 11px;border: 1px solid #cccccc;margin: 5px 2px;padding: 2px 10px;border-radius: 2px;">BEST</div>
                  <div v-if="item.isMd" style="font-size: 11px;border: 1px solid #cccccc;margin: 5px 2px;padding: 2px 10px;border-radius: 2px;">MD</div>
                  <div v-if="item.isHot" style="font-size: 11px;border: 1px solid #ff44cc;margin: 5px 2px;padding: 2px 10px;border-radius: 2px;">HOT</div>
                </v-card-actions>
              </v-card>
            </v-col>
          </v-row>
          <v-row>
              <v-col class="col-12" align="center">
                  <v-card-actions class="justify-center">
                      <v-btn to="/product/list" rounded color="secondary" light class="mb-8 pl-6 pr-6"> 여행상품 더보러가기</v-btn>
                  </v-card-actions>
              </v-col>
          </v-row>
      </div>

      <div class="hidden-sm-and-up align-center">
        <ul class="pa-0" style="width:100%;">
          <li v-for="item in products" :key="item.idx" class="pa-3">
            <v-card style="background-color: #f4f6f8">
              <div class="d-flex flex-no-wrap justify-space-between">
                <v-avatar
                    class="ma-3"
                    size="125"
                    tile>
                  <v-img :src="item.img" contain />
                </v-avatar>
                <div class="flex-fill fill-height">
                  <v-card-title>{{item.title}}</v-card-title>
                  <v-card-subtitle v-text="item.description" />
                </div>
              </div>
            </v-card>
          </li>
        </ul>

        <v-row>
          <v-col class="col-12" align="center">
            <v-card-actions class="justify-center">
              <v-btn to="/product/list" rounded large color="secondary" light class="mb-8 pl-6 pr-6"> 여행상품 더보러가기</v-btn>
            </v-card-actions>
          </v-col>
        </v-row>
      </div>
    </div>
</template>

<script>
    export default {
      name: "HomeDeal",
      data : () => ({
        products : [
            {
              idx:1,
              isMd: false,
              isBest: false,
              isHot: false,
              title : '오키나와 원데이 투어 + 아쿠아리움 티켓',
              description: 'text text',
              img: 'https://cdn.imweb.me/thumbnail/20191126/7028aaf1c9c7e.png'
            },
          {
            idx:2,
            isMd: false,
            isBest: true,
            isHot: false,
            title : '후쿠오카',
            description: 'text text',
            img: 'https://cdn.imweb.me/thumbnail/20200401/6a9528ec84ae7.jpg'
          },
          {
            idx:3,
            isMd: true,
            isBest: true,
            isHot: true,
            title : '오키나와 모델',
            description: '이쁘네',
            img: 'https://cdn.imweb.me/thumbnail/20200401/5f50063b6c7b7.jpg'
          },
          {
            idx:1,
            isMd: false,
            isBest: false,
            isHot: false,
            title : '오키나와 원데이 투어 + 아쿠아리움 티켓',
            description: 'text text',
            img: 'https://cdn.imweb.me/thumbnail/20191126/7028aaf1c9c7e.png'
          },
          {
            idx:2,
            isMd: false,
            isBest: true,
            isHot: false,
            title : '후쿠오카',
            description: 'text text',
            img: 'https://cdn.imweb.me/thumbnail/20200401/6a9528ec84ae7.jpg'
          },
          {
            idx:3,
            isMd: true,
            isBest: true,
            isHot: true,
            title : '오키나와 모델',
            description: '이쁘네',
            img: 'https://cdn.imweb.me/thumbnail/20200401/5f50063b6c7b7.jpg'
          }
        ]
      })
    }
</script>

<style scoped>

</style>
