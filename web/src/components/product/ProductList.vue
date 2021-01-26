<template>
    <v-main no-gutters>
        <v-container class="align-items-center" >

            <v-card class="pa-lg-4 pa-2 white elevation-1" xs outline>                
                <!-- <v-skeleton-loader type="image, image" xs></v-skeleton-loader> -->
                <!-- xs,sm: 400, md,lg:500, xl:600 -->
                <v-img src="https://cdn.imweb.me/thumbnail/20200401/5962531d55c43.jpg" class="products_img" max-height="600" />
            </v-card>
            
            <v-card class="pa-2 white elevation-1 mt-5 mb-3" outline>
                <v-card-title class="pl-0 pr-0 body-1"><strong class="secondary--text">하와이</strong>에 대한 검색결과입니다.</v-card-title>
                

                <div class="justify-space-between d-flex mb-1">
                    <v-flex >
                        <v-chip outlined filter small class="ml-1">최신순</v-chip>
                        <v-chip outlined filter small class="ml-1 mr-2">리뷰많은순</v-chip>
                    </v-flex>

                    <v-spacer />
                    <v-flex class="justify-end d-flex">
                        <v-chip small outlined label filter><v-icon small>mdi-format-list-bulleted</v-icon></v-chip>
                        <v-chip small class="ml-1" active outlined label filter><v-icon small>mdi-apps</v-icon></v-chip>
                    </v-flex>
                </div>

                <v-divider class="secondary mx-auto mt-2 mb-1" />

                <v-row>
                    <v-col v-for="(item, i) in products" :key="i" class="col-xl-3 col-lg-3 col-md-4 col-sm-4 col-6">
                        <router-link to="/product/555">

                            <v-card tile elevation="0" outlined style="font-size:12px">
                                <v-img width="100%" height="100%" style="background-color:#eeeeee" src="https://cdn.imweb.me/thumbnail/20200401/5962531d55c43.jpg" ></v-img>
                            <!-- <v-skeleton-loader tile type="image" width="100%" height="100%" /> -->
                                <v-card-subtitle class="body-2 pl-1 pb-1 pt-2 pr-0 text-truncate"><strong>{{item.title}}</strong></v-card-subtitle>
                                <v-card-text class="pl-1 pb-0 pt-0 pr-0" style="font-size:12px !important"> {{item.description}}</v-card-text>
                                <!-- <v-card-actions class="align-items-center">
                                    <v-rating
                                        class="mr-1"
                                        v-if="(item.rating || 0) > 0"
                                        :value="item.rating"
                                        color="amber"
                                        dense
                                        readonly
                                        size="16"></v-rating>
                                    <div class="grey&#45;&#45;text">
                                        ({{item.rating}} / 5)
                                    </div>
                                </v-card-actions> -->
                            </v-card>
                        </router-link>
                    </v-col>
                </v-row>

            </v-card>

        </v-container>
    </v-main>
</template>

<script>
    export default {
        name: "ProductList",
        data () {
            return {
                products: [
                    { title: '로빈슨 클럽', description: '카오락', img:'', rating:3 },
                    { title: '케이프판', description: '사무이', img:'', rating:4 },
                    { title: '인아야 밸리', description: '발리' ,rating:0},
                    { title: '디스커버리 까르띠까 플라자 호텔', description: '발리', img:'', rating:1 },
                    { title: '유앤미 바이 코쿤', description: '수상비행기',img:'', rating:5 },
                    { title: '오니쿠', description: '칸쿤 / 로스카보스' ,img:'', rating:5},
                    { title: '시크릿 더 바인', description: '칸쿤 / 로스카보스', img:'', rating:4 },
                    { title: '그랜드 파크 로얄', description: '칸쿤 / 로스카보스', img:'', rating:4 }
                ],
                items: [
                    'Foo', 'Bar', 'Fizz', 'Buzz'
                ]
            };
        }
    }
</script>

<style scoped>

</style>
