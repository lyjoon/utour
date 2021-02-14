<template>
  <div>

    <v-card-title>Review</v-card-title>
    <v-simple-table class="board_tbl">
      <template v-slot:default>
        <colgroup>
          <col width="10%"/>
          <col width="60%"/>
          <col width="20%"/>
          <col width="10%"/>
        </colgroup>
        <thead>
          <tr>
            <th class="text-left">
              번호
            </th>
            <th class="text-left">
              제목
            </th>
            <th class="text-left">
              작성자
            </th>
            <th class="text-left">
              등록일
            </th>
          </tr>
        </thead>
        <tbody>
        <tr
            v-for="item in desserts"
            :key="item.name"
        >
          <td>{{ item.calories }}</td>
          <td>제목</td>
          <td>{{ item.name }}</td>
          <td>2020.04.27</td>
        </tr>
        </tbody>
      </template>
    </v-simple-table>
  </div>
</template>

<script>
export default {
  name: "ProductReview",
  data () {
    return {
      desserts: [
        {
          name: 'Frozen Yogurt',
          calories: 159,
        },
        {
          name: 'Ice cream sandwich',
          calories: 237,
        },
        {
          name: 'Eclair',
          calories: 262,
        },
        {
          name: 'Cupcake',
          calories: 305,
        },
        {
          name: 'Gingerbread',
          calories: 356,
        },
        {
          name: 'Jelly bean',
          calories: 375,
        },
        {
          name: 'Lollipop',
          calories: 392,
        },
        {
          name: 'Honeycomb',
          calories: 408,
        },
        {
          name: 'Donut',
          calories: 452,
        },
        {
          name: 'KitKat',
          calories: 518,
        },
      ],
    }
  }
}
</script>

<style scoped>

</style>