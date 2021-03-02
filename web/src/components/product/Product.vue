<template>
    <v-main>
        <v-container>
            <v-row>
                <v-col class="col-xl-8 col-md-8 col-12 ">
                    <v-card height="440">
                        <div class="d-flex justify-space-between">
                            <div class="d-flex flex-column col-7 pr-1">
                                <v-img src="https://cdn.wallpapersafari.com/88/55/gqJiS2.jpg" height="400"></v-img>
                            </div>
                            <div class="d-flex flex-column col-5 pl-1">
                                <v-flex class="pb-1">
                                    <v-img height="200" src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Solid_blue.svg/1024px-Solid_blue.svg.png"></v-img>
                                </v-flex>
                                <v-flex class="pt-1 d-flex d-inline">
                                    <v-img height="200" src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Auto_Racing_Green.svg/1200px-Auto_Racing_Green.svg.png"></v-img>
                                </v-flex>
                            </div>
                        </div>
                    </v-card>
                </v-col>

                <v-col class="col-md-4 col-xl-4 col-12">
                    <v-card class="flex-fill" width="100%" height="440">
                        <v-card-title>럭스 사우스 아리</v-card-title>
                        <v-card-text>
                            <div class="body-1 mt-3">
                                <div> 몰디브 / 수상</div>
                                <div> Dhidhoofinolhu, South Ari Atoll, Maldives </div>
                                <div> www.luxresorts.com</div>
                                <div> 02-1023-1029</div>
                            </div>
                        </v-card-text>
                        <v-card-actions>
                            <div class="ma-2" thumb-color="primary" three-line>
                                <v-chip small>조식제공</v-chip>
                                <v-chip class="ma-1" small>피트니스</v-chip>
                                <v-chip class="ma-1" small>수영장</v-chip>
                                <v-chip class="ma-1" small>Wi-Fi</v-chip>
                                <v-chip class="ma-1" small>스파</v-chip>
                                <v-chip class="ma-1" small>흡연</v-chip>
                                <v-chip class="ma-1" small>주차1대</v-chip>
                            </div>
                        </v-card-actions>
                        <div class="pa-4">
                            <v-btn block large class="flex-fill secondary">문의하기</v-btn>
                            <v-btn block large class="flex-fill grey darken-2 mt-4" dark>여행사 전화상담 (mobile)</v-btn>
                        </div>
                    </v-card>
                </v-col>
            </v-row>

          <v-row>
            <v-col class="col-12">


            <v-card class="pa-3" min-height="50vh">
              <v-tabs active-class="darken-4" class="product_tab"
                      color="secondary" grow v-model="tabIdx">
                <v-tab v-for="item in tabs"
                       :key="item.id">{{ item.title }}</v-tab>
                <v-tabs-slider color="secondary" />
              </v-tabs>

              <v-tabs-items v-model="tabIdx">
                <v-tab-item
                    v-for="item in tabs"
                    :key="item.id">

                  <product-accommodation v-if="tabIdx == 0" />

                  <product-room v-if="tabIdx == 1" />

                  <product-review v-if="tabIdx == 2" />

                </v-tab-item>
              </v-tabs-items>
            </v-card>
            </v-col>
          </v-row>
        </v-container>
    </v-main>
</template>

<script>
    import ProductAccommodation from "@/components/product/ProductAccommodation";
    import ProductRoom from "@/components/product/ProductRoom";
    import ProductReview from "@/components/product/ProductReview";

    export default {
        name: "Product",
      components: {ProductAccommodation, ProductRoom, ProductReview},
      data () {
            return {
                tabIdx: 0,
                tabs: [
                    { id:0, title: '숙소정보' },
                    { id:1, title: '객실정보'},
                    { id:2, title: '이용후기'},
                ],
            };
        }
    }
</script>

<style scoped>

</style>
