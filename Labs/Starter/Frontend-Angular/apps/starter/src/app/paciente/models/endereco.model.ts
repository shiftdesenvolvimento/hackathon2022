export interface Endereco {
    id: number;
    logradouro: string;
    numero: string;
    complemento: string;
    bairro: string;
    cep: string;
    cidade: string;
    uf: string;
    enderecoPrincipal: boolean;
}