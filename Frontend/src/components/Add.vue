<template>
  <form :validation-schema="schema" @submit="studentSave">

    <h1 class="text-5xl font-extrabold dark:text-white">CLASS<small
        class="ml-2 font-semibold text-gray-500 dark:text-gray-400">MANAGEMENT SYSTEM</small></h1>
    <br>
    <form>
      <!-- Dropdown input  -->
      <div class="flex">
        <!-- <label for="search-dropdown" class="mb-2 text-sm font-medium text-gray-900 sr-only dark:text-white">Your
          Email</label> -->
        <!-- <button id="dropdown-button" data-dropdown-toggle="dropdown"
          class="flex-shrink-0 z-10 inline-flex items-center py-2.5 px-4 text-sm font-medium text-center text-gray-900 bg-gray-100 border border-gray-300 dark:border-gray-700 dark:text-white rounded-l-lg hover:bg-gray-200 focus:ring-4 focus:outline-none focus:ring-gray-300 dark:bg-gray-600 dark:hover:bg-gray-700 dark:focus:ring-gray-800"
          type="button">All<svg class="w-2.5 h-2.5 ml-2.5" aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
            fill="none" viewBox="0 0 10 6">
            <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
              d="m1 1 4 4 4-4" />
          </svg></button> -->
        <!-- <div id="dropdown" class="z-10 hidden bg-white divide-y divide-gray-100 rounded-lg shadow w-44 dark:bg-gray-700">
          <ul class="py-2 text-sm text-gray-700 dark:text-gray-200" aria-labelledby="dropdown-button">
            <li>
              <a href="#"
                class="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">StudentName</a>
            </li>
            <li>
              <a href="#"
                class="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">StudentAge</a>
            </li>
            <li>
              <a href="#"
                class="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">StudentAddress</a>
            </li>
            <li>
              <a href="#"
                class="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">Studentcontactnumber</a>
            </li>
            <li>
              <a href="#"
                class="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">StudentEmail</a>
            </li>
            <li>
              <a href="#"
                class="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">Teachersname</a>
            </li>
          </ul>
        </div> -->
        <!-- <div class="relative w-full">
          <input type="search" id="search-dropdown"
            class="block p-2.5 w-full z-20 text-sm text-gray-900 bg-gray-50 rounded-r-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-blue-500"
            placeholder="Search" required>
          <button type="submit"
            class="absolute top-0 right-0 p-2.5 h-full text-sm font-medium text-white bg-blue-700 rounded-r-lg border border-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800"><svg
              class="w-4 h-4" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 20 20">
              <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                d="m19 19-4-4m0-7A7 7 0 1 1 1 8a7 7 0 0 1 14 0Z" />
            </svg></button>
        </div> -->
      </div>
    </form>

    <div class="relative z-0 w-full mb-6 group">
      <input type="text" name="stdName" id="stdName"
        class="block py-2.5 px-0 w-full text-sm text-gray-900 bg-transparent border-0 border-b-2 border-gray-300 appearance-none dark:text-white dark:border-gray-600 dark:focus:border-green-500 focus:outline-none focus:ring-0 focus:border-green-600 peer"
        placeholder=" " required v-model="stdName" />
      <label for="stdName"
        class="peer-focus:font-medium absolute text-sm text-gray-500 dark:text-gray-400 duration-300 transform -translate-y-6 scale-75 top-3 -z-10 origin-[0] peer-focus:left-0 peer-focus:text-green-600 peer-focus:dark:text-green-500 peer-placeholder-shown:scale-100 peer-placeholder-shown:translate-y-0 peer-focus:scale-75 peer-focus:-translate-y-6">Student
        Name</label>
    </div>
    <div class="relative z-0 w-full mb-6 group">
      <input type="number" name="age" id="age"
        class="block py-2.5 px-0 w-full text-sm text-gray-900 bg-transparent border-0 border-b-2 border-gray-300 appearance-none dark:text-white dark:border-gray-600 dark:focus:border-green-500 focus:outline-none focus:ring-0 focus:border-green-600 peer"
        placeholder=" " required v-model="age" />
      <label for="age"
        class="peer-focus:font-medium absolute text-sm text-gray-500 dark:text-gray-400 duration-300 transform -translate-y-6 scale-75 top-3 -z-10 origin-[0] peer-focus:left-0 peer-focus:text-green-600 peer-focus:dark:text-green-500 peer-placeholder-shown:scale-100 peer-placeholder-shown:translate-y-0 peer-focus:scale-75 peer-focus:-translate-y-6">Student
        Age</label>
    </div>
    <div class="relative z-0 w-full mb-6 group">
      <input type="address" name="address" id="address"
        class="block py-2.5 px-0 w-full text-sm text-gray-900 bg-transparent border-0 border-b-2 border-gray-300 appearance-none dark:text-white dark:border-gray-600 dark:focus:border-green-500 focus:outline-none focus:ring-0 focus:border-green-600 peer"
        placeholder=" " required v-model="address" />
      <label for="address"
        class="peer-focus:font-medium absolute text-sm text-gray-500 dark:text-gray-400 duration-300 transform -translate-y-6 scale-75 top-3 -z-10 origin-[0] peer-focus:left-0 peer-focus:text-green-600 peer-focus:dark:text-green-500 peer-placeholder-shown:scale-100 peer-placeholder-shown:translate-y-0 peer-focus:scale-75 peer-focus:-translate-y-6">Student
        Address</label>
    </div>
    <div class="relative z-0 w-full mb-6 group">
      <input type="number" name="conNum" id="conNum"
        class="block py-2.5 px-0 w-full text-sm text-gray-900 bg-transparent border-0 border-b-2 border-gray-300 appearance-none dark:text-white dark:border-gray-600 dark:focus:border-green-500 focus:outline-none focus:ring-0 focus:border-green-600 peer"
        placeholder=" " required v-model="conNum" />
      <label for="conNum"
        class="peer-focus:font-medium absolute text-sm text-gray-500 dark:text-gray-400 duration-300 transform -translate-y-6 scale-75 top-3 -z-10 origin-[0] peer-focus:left-0 peer-focus:text-green-600 peer-focus:dark:text-green-500 peer-placeholder-shown:scale-100 peer-placeholder-shown:translate-y-0 peer-focus:scale-75 peer-focus:-translate-y-6">Student
        Contact Number</label>
    </div>
    <div class="relative z-0 w-full mb-6 group">
      <input type="email" name="email" id="email"
        class="block py-2.5 px-0 w-full text-sm text-gray-900 bg-transparent border-0 border-b-2 border-gray-300 appearance-none dark:text-white dark:border-gray-600 dark:focus:border-green-500 focus:outline-none focus:ring-0 focus:border-green-600 peer"
        placeholder=" " required v-model="email" />
      <label for="email"
        class="peer-focus:font-medium absolute text-sm text-gray-500 dark:text-gray-400 duration-300 transform -translate-y-6 scale-75 top-3 -z-10 origin-[0] peer-focus:left-0 peer-focus:text-green-600 peer-focus:dark:text-green-500 peer-placeholder-shown:scale-100 peer-placeholder-shown:translate-y-0 peer-focus:scale-75 peer-focus:-translate-y-6">Student
        Email</label>
    </div>
    <div class="relative z-0 w-full mb-6 group">
      <input type="name" name="teachName" id="teachName"
        class="block py-2.5 px-0 w-full text-sm text-gray-900 bg-transparent border-0 border-b-2 border-gray-300 appearance-none dark:text-white dark:border-gray-600 dark:focus:border-green-500 focus:outline-none focus:ring-0 focus:border-green-600 peer"
        placeholder=" " required v-model="teachName" />
      <label for="teachName"
        class="peer-focus:font-medium absolute text-sm text-gray-500 dark:text-gray-400 duration-300 transform -translate-y-6 scale-75 top-3 -z-10 origin-[0] peer-focus:left-0 peer-focus:text-green-600 peer-focus:dark:text-green-500 peer-placeholder-shown:scale-100 peer-placeholder-shown:translate-y-0 peer-focus:scale-75 peer-focus:-translate-y-6">Teacher's
        Name</label>
    </div>
    <!-- <button></button> -->
    <button type="submit"
      class="text-white bg-green-700 hover:bg-green-800 focus:ring-4 focus:outline-none focus:ring-green-300 font-medium rounded-lg text-sm w-full sm:w-auto px-5 py-2.5 text-center dark:bg-green-600 dark:hover:bg-green-700 dark:focus:ring-green-800">
      Submit
    </button>
    <br>
    <br>
    <right><button type="submit"
        class="text-white bg-green-700 hover:bg-green-800 focus:ring-4 focus:outline-none focus:ring-green-300 font-medium rounded-lg text-sm w-full sm:w-auto px-5 py-2.5 text-center dark:bg-green-600 dark:hover:bg-green-700 dark:focus:ring-green-800">
        back
      </button></right>
  </form>
</template>

<script>
import axios from 'axios';
import { Form, Field, ErrorMessage } from 'vee-validate';
import * as yup from 'yup';

export default {
  components: {
    Form,
    Field,
    ErrorMessage

  },
  data() {
    const schema = yup.object().shape({
      stdName: yup
        .string()
        .required('This is required')
        .min(3, 'must be at least 3 character!')
        .max(30, 'Must be maximum 30 charactor!'),

      age: yup
        .string()
        .required('This is required')
        .min(1, 'must be at least 3 character!')
        .max(3, 'Must be maximum 30 charactor!'),

      address: yup
        .string()
        .required('This is required')
        .min(3, 'must be at least 3 character!')
        .max(30, 'Must be maximum 30 charactor!'),

      conNum: yup
        .string()
        .required('This is required')
        .min(3, 'must be at least 3 character!')
        .max(30, 'Must be maximum 30 charactor!'),

      email: yup
        .string()
        .required('This is required')
        .min(3, 'must be at least 3 character!')
        .max(30, 'Must be maximum 30 charactor!'),

      teachName: yup
        .string()
        .required('This is required')
        .min(3, 'must be at least 3 character!')
        .max(30, 'Must be maximum 30 charactor!'),
    })
    return {
      schema,
      stdName: '',
      age: '',
      address: '',
      conNum: '',
      email: '',
      teachName: '',

    }
  },
  // method call
  methods: {
    studentSave() {
      let formData = new FormData();
      formData.append("stdName", this.stdName);
      formData.append("age", this.age);
      formData.append("address", this.address);
      formData.append("conNum", this.conNum);
      formData.append("email", this.email);
      formData.append("teachName", this.teachName);
      // alert(this.stdName);

      return axios
        .post('http://localhost:8080/save', formData, {
        })
        .then(response => {
          alert(response.data);
          return response.data;
        });

    }
  }

}
</script>
