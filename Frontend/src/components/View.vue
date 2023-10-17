<template>
  <div class="relative overflow-x-auto shadow-md sm:rounded-lg">
    <table class="w-full text-sm text-left text-gray-500 dark:text-gray-400">
      <thead class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
        <tr>
          <th scope="col" class="px-6 py-3">Student Name</th>
          <th scope="col" class="px-6 py-3">Age</th>
          <th scope="col" class="px-6 py-3">Student Address</th>
          <th scope="col" class="px-6 py-3">Contact Num</th>
          <th scope="col" class="px-6 py-3">Student Email</th>
          <th scope="col" class="px-6 py-3">Teacher Name</th>

          <th scope="col" class="px-6 py-3">

            <span class="sr-only">View</span>
          </th>
          <th scope="col" class="px-6 py-3">
            <span class="sr-only">Delete</span>
          </th>
        </tr>
        <tr v-for="data in viewStudent" :key="data">
          <td> {{ data.stdName }}</td>
          <td> {{ data.age }}</td>
          <td> {{ data.address }}</td>
          <td> {{ data.conNum }}</td>
          <td> {{ data.email }}</td>
          <td> {{ data.teachName }}</td>
          <td>
            <input type="button"
              class="text-white bg-red-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-green-300 font-medium rounded-lg text-sm w-full sm:w-auto px-5 py-2.5 text-center dark:bg-red-600 dark:hover:bg-red-700 dark:focus:ring-red-800"
              value="Delete" v-on:click="deleteStudent(data.id)" />
          </td>
          <td>
            <router-link :to="{ name: 'selectupdate', params: { id: data.id } }" type="button"
              class="text-white bg-green-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-green-300 font-medium rounded-lg text-sm w-full sm:w-auto px-5 py-2.5 text-center dark:bg-green-600 dark:hover:bg-green-700 dark:focus:ring-green-800">EDIT
            </router-link>
          </td>
        </tr>
      </thead>

    </table>
  </div>
</template>


<script>

import axios from 'axios';

export default {
  name: "completeProfile",
  components: {

  },
  data() {
    return {
      viewStudent: [],
    };
  },
  computed: {

  },
  mounted() {
    this.getAllStudent();
  },
  methods: {
    getAllStudent() {
      return axios
        .get("http://localhost:8080/view/all")
        .then(response => {
          this.viewStudent = response.data;

        }).catch(function (error) {
          return error;
        });
    },
    deleteStudent(id) {
      return axios
        .get("http://localhost:8080/delete/by/id/" + id)
        .then(response => {
          this.viewStudent = response.data;

        }).catch(function (error) {
          return error;
        });
    }

  },
}




</script>
