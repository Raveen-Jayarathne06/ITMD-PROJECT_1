<template>
    <div>

        <div class="relative">

            <br>
            <br>
            <hr />
            <br>
            <br>

            <label for="simple-search" class="sr-only">Search</label>
            <div class="relative w-full">
                <div class="absolute inset-y-0 left-0 flex items-center pl-3 pointer-events-none">
                    <svg class="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true"
                        xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 18 20">
                        <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                            d="M3 5v10M3 5a2 2 0 1 0 0-4 2 2 0 0 0 0 4Zm0 10a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm12 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm0 0V6a3 3 0 0 0-3-3H9m1.5-2-2 2 2 2" />
                    </svg>
                </div>
                <input type="text" id="simple-search"
                    class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-green-500 focus:border-green-500 block w-full pl-10 p-2.5  dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-green-500 dark:focus:border-green-500"
                    placeholder="Search  Name..." required v-model="searchParameterLike">
            </div>
            <button type="submit"
                class="p-2.5 ml-2 text-sm font-medium text-white bg-green-700 rounded-lg border border-green-700 hover:bg-green-800 focus:ring-4 focus:outline-none focus:ring-green-300 dark:bg-green-600 dark:hover:bg-green-700 dark:focus:ring-green-800"
                v-on:click="viewgivenStudent">
                <svg class="w-4 h-4" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 20 20">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                        d="m19 19-4-4m0-7A7 7 0 1 1 1 8a7 7 0 0 1 14 0Z" />
                </svg>

            </button>


        </div>
        <br><br><br>
        <div class="relative overflow-x-auto shadow-md sm:rounded-lg">
            <table class="w-full text-sm text-left text-gray-500 dark:text-gray-400">
                <thead class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400">
                    <tr>
                        <th scope="col" class="px-6 py-3">Student Name</th>
                        <th scope="col" class="px-6 py-3">Student Age</th>
                        <th scope="col" class="px-6 py-3">Student Address</th>
                        <th scope="col" class="px-6 py-3">Student Contact Number</th>
                        <th scope="col" class="px-6 py-3">Student Email</th>
                        <th scope="col" class="px-6 py-3">Teacher Name</th>

                        <th scope="col" class="px-6 py-3">
                            <span class="sr-only">Delete</span>
                        </th>

                        <!-- <th scope="col" class="px-6 py-3">
                            <span class="sr-only">update</span>
                        </th> -->
                    </tr>
                    <tr v-for="data in viewStudent" :key="data">
                        <td> {{ data.stdName }}</td>
                        <td> {{ data.age }}</td>
                        <td> {{ data.address }}</td>
                        <td> {{ data.conNum }}</td>
                        <td> {{ data.email }}</td>
                        <td> {{ data.teachName }}</td>
                    </tr>
                </thead>
            </table>
        </div>
    </div>
</template>

<script>
import axios from 'axios';

export default {
    data() {
        return {
            searchParameter: '',
            searchParameterLike: '',
            viewStudent: [],

        }
    },
    mounted() {
        // this.viewgivenStudent();
    },
    methods: {
        
        viewgivenStudent() {
            return axios
                .get('http://localhost:8080/select/by/stdname/like/' + this.searchParameterLike, {
                })
                .then(response => {
                    this.viewStudent = response.data;
                });
        }
    }

}
</script>