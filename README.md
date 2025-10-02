# App Alcool ou Gasolina

## :camera_flash: Screenshot

<img width="260" alt="Image" src="https://github.com/user-attachments/assets/4df286ec-0972-492f-8bed-7ac66e2bb207" /> <img width="263" alt="Image" src="https://github.com/user-attachments/assets/36341c13-2195-46dd-8ff9-788769b3cbce" /> <img width="278" alt="Image" src="https://github.com/user-attachments/assets/cc80597d-932c-4509-943d-54d7a4cc87a5" />


## Introdução às Tecnologias Usadas. PT/BR

O aplicativo "Alcohol or Gasoline" foi desenvolvido como um projeto Android para ajudar os usuários a decidir entre o uso de álcool ou gasolina com base na relação de preços. Abaixo estão as principais tecnologias e bibliotecas empregadas no desenvolvimento:

- **Kotlin**: Linguagem de programação principal utilizada para criar uma lógica eficiente e moderna. O código aproveita recursos como classes e funções para gerenciar a interface e os cálculos.
- **Android SDK**: Base para o desenvolvimento nativo do aplicativo, incluindo a classe `AppCompatActivity` para suportar versões mais antigas do Android e a funcionalidade `enableEdgeToEdge` para uma experiência de tela cheia.
- **AndroidX**: Biblioteca de suporte utilizada para componentes como `ViewCompat` e `WindowInsetsCompat`, garantindo compatibilidade e ajustes automáticos de layout com as bordas da tela.
- **Material Design Components**: Inclui `TextInputLayout` e `TextInputEditText` da biblioteca `com.google.android.material`, oferecendo uma interface de usuário intuitiva com campos de entrada validados e feedback visual.
- **XML Layouts**: Usado para definir a interface do usuário no arquivo `activity_main.xml`, conectando elementos como botões (`Button`), campos de texto (`TextView`), e entradas de usuário via `findViewById`.
- **Lógica de Negócio**: Implementada com funções personalizadas (`calcularMelhorPreco` e `validarcampus`) para validar entradas e calcular a melhor opção de combustível com base na relação preço/alcohol ÷ preço/gasolina ≤ 0.7.
- 
- Este projeto reflete uma aplicação prática de conceitos básicos de desenvolvimento Android, com foco em usabilidade e validação de dados.

- ## Introduction to Technologies Used. EN

The "Alcohol or Gasoline" app was developed as an Android project to assist users in deciding between alcohol or gasoline based on price ratios. Below are the key technologies and libraries employed in its development:

- **Kotlin**: The primary programming language used to create efficient and modern logic. The code leverages features like classes and functions to manage the interface and calculations.
- **Android SDK**: The foundation for native Android development, including the `AppCompatActivity` class for backward compatibility and the `enableEdgeToEdge` feature for a full-screen experience.
- **AndroidX**: Support library utilized for components like `ViewCompat` and `WindowInsetsCompat`, ensuring compatibility and automatic layout adjustments with screen edges.
- **Material Design Components**: Includes `TextInputLayout` and `TextInputEditText` from the `com.google.android.material` library, providing an intuitive user interface with validated input fields and visual feedback.
- **XML Layouts**: Used to define the user interface in the `activity_main.xml` file, connecting elements such as buttons (`Button`), text views (`TextView`), and user input fields via `findViewById`.
- **Business Logic**: Implemented with custom functions (`calcularMelhorPreco` and `validarcampus`) to validate inputs and determine the best fuel option based on the price ratio (alcohol price ÷ gasoline price ≤ 0.7).

This project reflects a practical application of basic Android development concepts, with a focus on usability and data validation.
